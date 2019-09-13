package com.metacube.Mailer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AppController {

	@Autowired
	MockMailSender mockMailSender = null;

	public MockMailSender getMockMailSender() {
		return mockMailSender;
	}

	public void setMockMailSender(MockMailSender mockMailSender) {
		this.mockMailSender = mockMailSender;
	}

}
