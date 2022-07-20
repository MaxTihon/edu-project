package com.maxtihon.speaker.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

//@Service
public class MessageProducer {
    private static final Logger log = LoggerFactory.getLogger(MessageProducer.class);
    private final JmsTemplate jmsTemplate;

   // @Autowired
    public MessageProducer(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    @Value("${jms.queue}")
    private String queue;

    public void send(String message) {
        log.info("Sending message==> " + message);
        jmsTemplate.convertAndSend(queue, message);
    }
}
