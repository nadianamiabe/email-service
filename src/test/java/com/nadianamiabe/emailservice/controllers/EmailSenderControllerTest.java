package com.nadianamiabe.emailservice.controllers;

import com.nadianamiabe.emailservice.core.EmailRequest;
import com.nadianamiabe.emailservice.core.EmailSenderUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class EmailSenderControllerTest {
    @Test
    public void testSendEmail() {
        EmailSenderUseCase emailSenderUseCase = Mockito.mock(EmailSenderUseCase.class);
        EmailSenderController emailSenderController = new EmailSenderController(emailSenderUseCase);
        EmailRequest emailRequest = new EmailRequest("teste@teste.com", "teste", "testando");

        var result = emailSenderController.sendEmail(emailRequest);

        Mockito.verify(emailSenderUseCase, Mockito.times(1))
                .sendEmail(emailRequest.to(), emailRequest.subject(), emailRequest.content());
        Assertions.assertEquals(result.getStatusCode().value(), 200);
        Assertions.assertEquals(result.getBody(), "Email sent successfully");
    }
}
