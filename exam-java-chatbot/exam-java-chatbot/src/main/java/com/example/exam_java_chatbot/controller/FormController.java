package com.example.exam_java_chatbot.controller;

import com.example.exam_java_chatbot.model.Message;
import com.example.exam_java_chatbot.model.User;
import com.example.exam_java_chatbot.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Controller
public class FormController {

    @Autowired
    private HomeService homeService;

    @GetMapping("form/{id}")
    public String getForm(@PathVariable("id") Integer id, Model model) {
        List<Message> messages = homeService.getUserMessages(id);
        model.addAttribute("messages", messages);

        User user = homeService.findUserById(id);

        List<String> botResponses = homeService.getUserBotResponses(id);

        model.addAttribute("user", user);
        model.addAttribute("botResponses", botResponses);

        return "form";
    }


    @GetMapping("form")
    public String getForm() {
        return "form";
    }

    @GetMapping("")
    public String homePage() { return "index"; };

    @GetMapping("users")
    public String getUsers(Model model) {
        List<User> users = homeService.getAllUsers();
        model.addAttribute("users", users);
        return "users";
    }

    @GetMapping("profile/{id}")
    public String getUserProfile(@PathVariable("id") Integer id, Model model) {
        Optional<User> user = homeService.getUserProfile(id);
        model.addAttribute("user", user.get());

        List<Message> messages = homeService.getUserMessages(id);
        model.addAttribute("messages", messages);

        return "profile";
    }

    @PostMapping("form")
    public String handleSubmit(@RequestParam("username") String username, @RequestParam("message") String message, Model model) {
        LocalDateTime date = LocalDateTime.now();

        User user = homeService.findOrCreateUser(username);

        Message newMessage = new Message(user, message, date);
        homeService.saveMessage(newMessage);

        homeService.generateBotResponse(user);

        model.addAttribute("username", username);
        model.addAttribute("message", message);
        model.addAttribute("date", date);

        return "redirect:/form/" + user.getId();
    }
}
