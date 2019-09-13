package com.metacube.Mailer;

import org.springframework.stereotype.Component;

@Component
public class MockMailSender implements MailSender {

	@Override
	public String writeContent() {
		return "mail content";
	}

	@Override
	public void sendMail() {

	}

	@Override
	public String toString() {
		return "return";
	}

}
