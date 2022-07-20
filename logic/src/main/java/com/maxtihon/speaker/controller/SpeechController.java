package com.maxtihon.speaker.controller;

import com.maxtihon.speaker.service.MessageProducer;
import com.maxtihon.speaker.service.SpeechService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//@RestController
public class SpeechController {
    private final SpeechService speechService;
    private final MessageProducer messageProducer;

    //@Autowired
    public SpeechController(SpeechService speechService, MessageProducer messageProducer) {
        this.speechService = speechService;
        this.messageProducer = messageProducer;
    }

    @GetMapping(value = "/sentences")
    public String getSentence() {
        return speechService.generateAndGetNewSentence();
    }

    @GetMapping(value = "/send")
    public String sendMessage(@RequestBody String message) {
        messageProducer.send(message);

        return "Message sent: " + message;
    }
}
