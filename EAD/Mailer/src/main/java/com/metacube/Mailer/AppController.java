package com.metacube.Mailer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("appController")
public class AppController {

	// dependency injection using field 
	@Autowired
	@Qualifier("mockMailSender")
	MailSender mailSender;

	// 1.1 dependency injection using constructor
	@Autowired
	public AppController(MailSender mockMailSender) {
	}

	// 1.2 dependency injection using setter method
	@Autowired
	@Qualifier("mockMailSender")
	public void setMailSender(MailSender mailSender) {
		this.mailSender = mailSender;
	}

	@Autowired
	public void checkMock() {
		mailSender.writeContent();
	}

	public MailSender getMailSender() {
		return mailSender;
	}

}
