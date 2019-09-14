package com.metacube.Mailer;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class MockMailSender implements MailSender {

	MockMailSender mockMailSender;

	public MockMailSender getMockMailSender() {
		return mockMailSender;
	}

	public void setMockMailSender(MockMailSender mockMailSender) {
		this.mockMailSender = mockMailSender;
	}

	@Override
	public String writeContent() {
		return "mail content";
	}

	@Override
	public void sendMessage() {
	}

}
