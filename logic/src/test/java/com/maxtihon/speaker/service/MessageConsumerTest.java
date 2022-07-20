package com.maxtihon.speaker.service;

import org.apache.activemq.artemis.junit.EmbeddedActiveMQResource;
import org.junit.Rule;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;

class MessageConsumerTest {

    @Rule
    public EmbeddedActiveMQResource resource = new EmbeddedActiveMQResource();

    @MockBean
    private MessageProducer producer;

    @Test
    void receive() {
        
    }
}