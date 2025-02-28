package com.example.exam_java_endpoint.model;

import jakarta.persistence.*;

@Entity
public class Bot {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String response;

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

    @Override
    public String toString() {
        return "Bot ID: " + id + ", Response: " + response;
    }
}
