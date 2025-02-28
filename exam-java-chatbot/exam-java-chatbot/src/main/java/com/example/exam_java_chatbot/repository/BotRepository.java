package com.example.exam_java_chatbot.repository;

import com.example.exam_java_chatbot.model.Bot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BotRepository extends JpaRepository<Bot, Integer> {
}
