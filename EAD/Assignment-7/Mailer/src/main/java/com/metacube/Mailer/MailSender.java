package com.metacube.Mailer;

import org.springframework.stereotype.Component;

@Component
public interface MailSender {

	// function to send mail to desired reciever
	public void sendMessage();

}
