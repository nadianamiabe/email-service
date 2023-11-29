package com.nadianamiabe.emailservice.application;

import com.nadianamiabe.emailservice.adapters.EmailSenderGateway;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class EmailSenderUseCaseImplTest {

    @Test
    public void testSendEmail() {
        EmailSenderGateway emailSenderGateway = Mockito.mock(EmailSenderGateway.class);
        EmailSenderUseCaseImpl emailSenderUseCaseImpl = new EmailSenderUseCaseImpl(emailSenderGateway);

        emailSenderUseCaseImpl.sendEmail("teste@teste.com", "teste", "testando");
        Mockito.verify(emailSenderGateway, Mockito.times(1))
                .sendEmail("teste@teste.com", "teste", "testando");
    }
}
