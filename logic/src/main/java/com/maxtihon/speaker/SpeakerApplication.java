package com.maxtihon.speaker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableFeignClients
@SpringBootApplication
public class SpeakerApplication {
	private static final Logger log = LoggerFactory.getLogger(SpeakerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpeakerApplication.class, args);
	}
}
