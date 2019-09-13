package com.metacube.Mailer;

public interface MailSender {

	// function to write message to be sent via mail
	public String writeContent();

	// function to send mail to desired reciever
	public void sendMail();

}
