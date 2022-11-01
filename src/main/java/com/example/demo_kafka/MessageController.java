package com.example.demo_kafka;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/messages")
public class MessageController {

    private KafkaTemplate<String,MessageRequest> kafkaTemplate;

    public MessageController(KafkaTemplate<String, MessageRequest> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }
    @PostMapping("/publish")
    public String  publish(@RequestBody MessageRequest request)
    {
        kafkaTemplate.send("Vinesh", request);
        return "Publish Successfully";
    }

}
