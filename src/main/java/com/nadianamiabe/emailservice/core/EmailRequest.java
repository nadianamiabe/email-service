package com.nadianamiabe.emailservice.core;

public record EmailRequest(String to, String subject, String content) {
}
