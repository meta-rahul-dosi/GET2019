package com.metacube.Mailer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AppController {

	@Autowired
	@Qualifier("mockMailSender")
	private MailSender mailSender;

	// constructor injection
	@Autowired
	public AppController(@Qualifier("smtpMailSender") MailSender mailSender) {
		super();
		this.mailSender = mailSender;
	}

	// setter injection
	@Autowired
	@Qualifier("smtpMailSender")
	public void setMailSender(MailSender mailSender) {
		this.mailSender = mailSender;
	}

	// getter
	public MailSender getMailSender() {
		return mailSender;
	}

}
