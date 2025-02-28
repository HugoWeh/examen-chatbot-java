package com.example.exam_java_chatbot.model;

import jakarta.persistence.*;

@Entity
public class Bot {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String response;

    @ManyToOne
    private User user;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Bot ID: " + id + ", Response: " + response;
    }
}
