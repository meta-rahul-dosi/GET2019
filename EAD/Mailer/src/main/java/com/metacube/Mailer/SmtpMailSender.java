package com.metacube.Mailer;

import org.springframework.stereotype.Component;

@Component
public class SmtpMailSender implements MailSender {

	@Override
	public void sendMessage() {
		System.out.println("SMTP Mail Sender");
	}
}
