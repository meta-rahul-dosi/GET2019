package com.metacube.Mailer;

public class SmtpMailSender implements MailSender {

	@Override
	public String writeContent() {
		return "";
	}

	@Override
	public void sendMail() {
		System.out.println("message in the mail is ");
	}

}
