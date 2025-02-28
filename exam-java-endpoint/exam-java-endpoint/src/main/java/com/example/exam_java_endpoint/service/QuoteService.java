package com.example.exam_java_endpoint.service;

import com.example.exam_java_endpoint.model.Bot;
import com.example.exam_java_endpoint.repository.BotRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;

@Service
public class QuoteService {
    private final BotRepository botRepository;

    public QuoteService(BotRepository botRepository) {
        this.botRepository = botRepository;
    }

    public Optional<Bot> generateBotResponse() {
        Random random = new Random();
        Integer id = random.nextInt(50) + 1;

        return botRepository.findById(id);
    }
}
