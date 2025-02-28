package com.example.exam_java_chatbot.service;

import com.example.exam_java_chatbot.model.Bot;
import com.example.exam_java_chatbot.model.Message;
import com.example.exam_java_chatbot.model.User;
import com.example.exam_java_chatbot.repository.BotRepository;
import com.example.exam_java_chatbot.repository.MessageRepository;
import com.example.exam_java_chatbot.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class HomeService {
    private final UserRepository userRepository;
    private final MessageRepository messageRepository;
    private final BotRepository botRepository;
    private final RestTemplate restTemplate;

    private static final String BOT_API_URL = "http://localhost:8081/";

    public HomeService(UserRepository userRepository, MessageRepository messageRepository, BotRepository botRepository) {
        this.userRepository = userRepository;
        this.messageRepository = messageRepository;
        this.botRepository = botRepository;
        this.restTemplate = new RestTemplate();
    }

    public User findOrCreateUser(String username) {
        Optional<User> optionalUser = userRepository.findByName(username);
        return optionalUser.orElseGet(() -> userRepository.save(new User(username)));
    }

    public User findUserById(Integer id) {
        return userRepository.findById(id).orElse(null);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserProfile(Integer id) {
        return userRepository.findById(id);
    }

    public List<Message> getUserMessages(Integer id) {
        Optional<User> user = userRepository.findById(id);
        return user.map(User::getMessages).orElse(Collections.emptyList());
    }

    public void saveMessage(Message message) {
        messageRepository.save(message);
    }

    public void generateBotResponse(User user) {
        Optional<Bot> botResponse = Optional.ofNullable(restTemplate.getForObject(BOT_API_URL, Bot.class));

        botResponse.ifPresent(bot -> {
            bot.setUser(user);
            botRepository.save(bot);
            user.getBotResponses().add(bot);
            userRepository.save(user);
        });
    }

    public List<String> getUserBotResponses(Integer id) {
        Optional<User> user = userRepository.findById(id);
        return user.map(u ->
                u.getBotResponses().stream()
                        .map(Bot::getResponse)
                        .collect(Collectors.toList())
        ).orElse(Collections.emptyList());
    }
}