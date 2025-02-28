package com.example.exam_java_endpoint.controller;

import com.example.exam_java_endpoint.model.Bot;
import com.example.exam_java_endpoint.service.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class QuoteController {

    @Autowired
    private QuoteService quoteService;

    @GetMapping("")
    public Optional<Bot> getForm(Model model) {
        return quoteService.generateBotResponse();
    }
}
