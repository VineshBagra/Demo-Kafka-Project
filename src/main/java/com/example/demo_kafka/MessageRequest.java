package com.example.demo_kafka;

import java.util.Objects;

public class MessageRequest {
    private String message;

    public MessageRequest() {
    }

    public MessageRequest(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

}
