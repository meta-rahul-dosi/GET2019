package com.metacube.Mailer;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class MockMailSender implements MailSender {

	@Override
	public void sendMessage() {
		System.out.println("Mock Mail Sender");
	}

}
