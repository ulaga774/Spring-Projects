package com.xworkz.email;

import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;
import java.util.Random;

public class Email {
	
    public static void main(String[] args) {
        // Generate a random OTP (e.g., 6 digits)
        String otp = generateOTP(6);

        // Sender's email address and password
        String senderEmail = "ulaga774xworkz@gmail.com";
        String senderPassword = "ulaga007";

        // Recipient's email address
        String recipientEmail = "ulaga774xworkz@gmail.com";

        // Email configuration
        Properties properties = new Properties();
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");

        // Create a Session with authentication
        Session session = Session.getInstance(properties, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(senderEmail, senderPassword);
            }
        });

        try {
            // Create a message
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(senderEmail));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipientEmail));
            message.setSubject("Your OTP");
            message.setText("Your OTP is: " + otp);

            // Send the message
            Transport.send(message);

            System.out.println("OTP sent successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Function to generate a random OTP
    private static String generateOTP(int length) {
        String numbers = "0123456789";
        Random random = new Random();
        StringBuilder otp = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            otp.append(numbers.charAt(random.nextInt(numbers.length())));
        }
        return otp.toString();
    }
}

