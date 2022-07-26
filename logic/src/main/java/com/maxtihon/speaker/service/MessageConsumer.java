package com.maxtihon.speaker.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

//@Service
public class MessageConsumer {
    private final Logger log = LoggerFactory.getLogger(MessageConsumer.class);

    @JmsListener(destination = "${jms.queue}")
    public void receive(String message) {
        log.info("Received message: " + message);
    }
}
