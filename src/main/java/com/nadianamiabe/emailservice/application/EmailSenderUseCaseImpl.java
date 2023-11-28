package com.nadianamiabe.emailservice.application;

import com.nadianamiabe.emailservice.adapters.EmailSenderGateway;
import com.nadianamiabe.emailservice.core.EmailSenderUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderUseCaseImpl implements EmailSenderUseCase {
    private final EmailSenderGateway emailSenderGateway;

    @Autowired
    public EmailSenderUseCaseImpl(EmailSenderGateway emailGateway) {
        this.emailSenderGateway = emailGateway;
    }
    @Override
    public void sendEmail(String to, String subject, String content) {
        this.emailSenderGateway.sendEmail(to, subject, content);
    }
}
