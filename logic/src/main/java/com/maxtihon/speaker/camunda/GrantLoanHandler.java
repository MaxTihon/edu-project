package com.maxtihon.speaker.camunda;

import org.camunda.bpm.client.spring.annotation.ExternalTaskSubscription;
import org.camunda.bpm.client.task.ExternalTask;
import org.camunda.bpm.client.task.ExternalTaskHandler;
import org.camunda.bpm.client.task.ExternalTaskService;
import org.springframework.stereotype.Component;

import java.util.logging.Level;
import java.util.logging.Logger;

@Component
@ExternalTaskSubscription("loanGranter")
public class GrantLoanHandler implements ExternalTaskHandler {

    @Override
    public void execute(ExternalTask externalTask, ExternalTaskService externalTaskService) {
        String customerId = externalTask.getVariable("customerId");
        int creditScore = externalTask.getVariable("creditScore");

        externalTaskService.complete(externalTask);

        Logger.getLogger("loanGranter").log(Level.INFO, "Loan for customer {0} with credit score {1} granted!", new Object[]{customerId, creditScore}
        );
    }
}
