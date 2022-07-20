package com.maxtihon.speaker.service;

import com.maxtihon.speaker.client.FirstPhraseClient;
import com.maxtihon.speaker.client.FourthPhraseClient;
import com.maxtihon.speaker.client.SecondPhraseClient;
import com.maxtihon.speaker.client.ThirdPhraseClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpeechServiceImpl implements SpeechService {
    private final FirstPhraseClient firstPhraseClient;
    private final SecondPhraseClient secondPhraseClient;
    private final ThirdPhraseClient thirdPhraseClient;
    private final FourthPhraseClient fourthPhraseClient;

    @Autowired
    public SpeechServiceImpl(FirstPhraseClient firstPhraseClient, SecondPhraseClient secondPhraseClient, ThirdPhraseClient thirdPhraseClient, FourthPhraseClient fourthPhraseClient) {
        this.firstPhraseClient = firstPhraseClient;
        this.secondPhraseClient = secondPhraseClient;
        this.thirdPhraseClient = thirdPhraseClient;
        this.fourthPhraseClient = fourthPhraseClient;
    }

    @Override
    public String generateAndGetNewSentence() {
        return String.format("%s %s %s %s",
                firstPhraseClient.getFirstPhrase(),
                secondPhraseClient.getSecondPhrase(),
                thirdPhraseClient.getThirdPhrase(),
                fourthPhraseClient.getFourthPhrase());
    }
}
