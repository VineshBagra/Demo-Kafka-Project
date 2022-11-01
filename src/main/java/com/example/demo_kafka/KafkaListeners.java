package com.example.demo_kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
    @KafkaListener(topics ="Vinesh", groupId = "grpId")
    void listener(String data)
    {
          System.out.println("Listener received:" + data);
    }
}
