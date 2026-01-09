package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/messages")
public class MessageController {

    @Autowired
    private MessageRepository repository;

    @GetMapping
    public List<Message> getAllMessages() {
        return repository.findAll();
    }

    @PostMapping
    public Message createMessage(@RequestBody Message message) {
        return repository.save(message);
    }
}
