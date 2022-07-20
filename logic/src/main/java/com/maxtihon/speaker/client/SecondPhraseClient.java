package com.maxtihon.speaker.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "secondPhrase", url = "http://localhost:3000/")
public interface SecondPhraseClient {
    @RequestMapping(method = RequestMethod.GET, value = "/phrases")
    String getSecondPhrase();
}
