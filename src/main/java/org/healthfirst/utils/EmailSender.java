package org.healthfirst.utils;

import java.util.Properties;
import javax.activation.*;
import javax.mail.*;
import javax.mail.internet.*;

public class EmailSender {
	public static void emailSender() {

		final String username = "deshimhk@gmail.com";
		final String password = "MmhK@2789";

		Properties properties = new Properties();
		properties.put("mail.smtp.auth", true);
		properties.put("mail.smtp.starttls.enable", true);
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.port", "465");

		Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});

		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("mahmushkhan@gmail.com"));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("mahmushkhan@gmail.com"));
			message.setSubject("Testing Subject");
			message.setText("PFA");

			MimeBodyPart messageBodyPart = new MimeBodyPart();

			Multipart multipart = new MimeMultipart();

			String file = "org.healthfirst\\target\\cucumber-TestNG.html";
			String fileName = "index.html";
			DataSource source = new FileDataSource(file);
			messageBodyPart.setDataHandler(new DataHandler(source));
			messageBodyPart.setFileName(fileName);
			multipart.addBodyPart(messageBodyPart);

			message.setContent(multipart);

			System.out.println("Sending");

			Transport.send(message);

			System.out.println("Email sent successfully with attachment.");

		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}

}
