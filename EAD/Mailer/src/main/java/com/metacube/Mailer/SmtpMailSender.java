package com.metacube.Mailer;

import org.springframework.stereotype.Component;

@Component
public class SmtpMailSender implements MailSender {

	SmtpMailSender smtpMailSender;

	public SmtpMailSender getSmtpMailSender() {
		return smtpMailSender;
	}

	public void setSmtpMailSender(SmtpMailSender smtpMailSender) {
		this.smtpMailSender = smtpMailSender;
	}

	@Override
	public void sendMessage() {
		System.out.println("mail sent....");
	}

	@Override
	public String writeContent() {
		return "   ";
	}
}
