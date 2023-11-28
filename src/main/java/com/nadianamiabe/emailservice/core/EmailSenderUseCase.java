package com.nadianamiabe.emailservice.core;

public interface EmailSenderUseCase {
    void sendEmail(String to, String subject, String content);
}
