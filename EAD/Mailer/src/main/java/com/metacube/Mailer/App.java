package com.metacube.Mailer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(
				Config.class);

		AppController appController = (AppController) context
				.getBean("appController");

		// MailSender mailSender = (MailSender)context.getBean("appController");
		System.out.println(appController.getMailSender().writeContent());
		System.out.println("FINISH");
	}
}
