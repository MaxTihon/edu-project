package com.maxtihon.speaker.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "fourthPhrase", url = "http://localhost:5050/")
public interface FourthPhraseClient {
    @RequestMapping(method = RequestMethod.GET, value = "/phrases")
    String getFourthPhrase();
}
