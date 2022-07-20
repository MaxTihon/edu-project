package com.maxtihon.speaker.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "firstPhrase", url = "http://localhost/")
public interface FirstPhraseClient {
    @RequestMapping(method = RequestMethod.GET, value = "/phrases")
    String getFirstPhrase();
}
