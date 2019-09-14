package com.metacube.Mailer;

import org.springframework.stereotype.Component;

@Component
public interface MailSender {

	// function to write message to be sent via mail
	public String writeContent();

	// function to send mail to desired reciever
	public void sendMessage();

}
