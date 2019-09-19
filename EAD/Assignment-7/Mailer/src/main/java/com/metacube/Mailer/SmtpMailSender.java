package com.metacube.Mailer;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SmtpMailSender implements MailSender {

	@Override
	public void sendMessage() {
		System.out.println("SMTP Mail Sender");
	}
}
