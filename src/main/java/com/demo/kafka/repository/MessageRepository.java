package com.demo.kafka.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.demo.kafka.entity.Message;

public interface MessageRepository extends JpaRepository<Message, Long> {
}