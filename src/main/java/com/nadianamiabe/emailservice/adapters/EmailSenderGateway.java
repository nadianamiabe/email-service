package com.nadianamiabe.emailservice.adapters;

public interface EmailSenderGateway {
    void sendEmail(String to, String subject, String content);
}
