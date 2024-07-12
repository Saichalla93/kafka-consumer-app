package com.demo.kafka.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.demo.kafka.entity.Message;

import com.demo.kafka.repository.MessageRepository;

@Service
public class ConsumerService {

    private final Logger logger = LoggerFactory.getLogger(ConsumerService.class);
    
    @Autowired
    private MessageRepository messageRepository;

    @KafkaListener(topics = {"${kafka.topic}"}, groupId = "${kafka.consumer.group-id}")
    public void consumeMessage(String message) {
        Message msg = new Message();
        msg.setContent(message);
        messageRepository.save(msg);
        logger.info("Message successfully processed: {}", message);
    }

}