package com.utt.govind;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fromEmailId = "govindamble27@gmail.com";  // it should be your
														 // gmailId
		String password = "";                  // from emailId's password
		String toEmailId = "gdamble27@gmail.com";        // it should be gmailId (to
													    // whom you want to send)

		String subject="** important information **";
		
		String content="Hello, This is Govind....";
		
		Calendar today = Calendar.getInstance();
		Timer timer = new Timer();

		timer.schedule(new TimerTask() {
			public void run() {
				long min=LocalDateTime.now().getMinute();
				long hour=LocalDateTime.now().getHour();
				if(hour==18 && (min==43)){                //6:43PM        //Time at which you want to send the mail //for PM add +12 to your time
					System.out.println("Sending mail now");	
					SendMaill(fromEmailId, password, toEmailId,subject,content);
				}else{
					System.out.println("Checking for the time");
				}
			}
		}, today.getTime(), TimeUnit.SECONDS.toMillis(5)); //TimeUnit.SECONDS.toMillis(5) -->> interval
	}

	public static void SendMaill(String fromEmailId, String password, String toEmailId, String subject, String content) {
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
		props.put("mail.debug", "true");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.localhost", "www.uttarainfo.com");

		Session s = Session.getInstance(props, null);
		s.setDebug(true);

		MimeMessage message = new MimeMessage(s);

		try {

			InternetAddress from = new InternetAddress(fromEmailId, "Govind");// "Govind"  your name
																				
			InternetAddress to = new InternetAddress(toEmailId);

			message.setSentDate(new Date());
			message.setFrom(from);
			message.addRecipient(Message.RecipientType.TO, to);

			message.setSubject(subject);
			message.setContent(content, "text/plain");

			Transport tr = s.getTransport("smtp");
			tr.connect("smtp.gmail.com", fromEmailId, password);
			message.saveChanges();
			tr.sendMessage(message, message.getAllRecipients());
			System.out.println("..........................................");
			tr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
