package com.xworkz.landrecord.service;

import java.util.Properties;
import java.util.Random;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.persistence.NoResultException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import com.xworkz.landrecord.dto.LandRecordAdminDto;
import com.xworkz.landrecord.repositry.LandRecordRepo;

@Component
@Service
public class LandRecordServiceImpl implements LandRecordService {

	@Autowired
	private LandRecordRepo repo;

	@Override
	public boolean save(LandRecordAdminDto dto, Model model) {
		if (dto != null) {
			if (dto.getEmail().length() >= 3) {
				if (dto.getOtp().length() >= 3) {
					System.out.println("saved");
					return repo.save(dto);
				}
				System.out.println("otp is invalid");
				model.addAttribute("otpError", "otp invaild");
				return false;
			}
			System.out.println("email is invalid");
			model.addAttribute("EmailError", "Email invaild");
			return false;
		}
		System.out.println("dto is null");
		return false;
	}

	@Override
	public LandRecordAdminDto findByMail(String mail, Model model) {
		try {
			if (mail != null) {
				LandRecordAdminDto list = repo.findByMail(mail, model);
				System.out.println("findByMail in service line 55" + list);
				return list;
			} else {
				System.out.println("Email Not Found - Enter Correct Email");
				return null;
			}

		} catch (NoResultException e) {
			e.printStackTrace();
			System.out.println("Exception: " + e.getMessage());
			model.addAttribute("findEmail", "email not found");
			return null;
		}

	}

	public String generateOtp(int length) {

		Random random = new Random();
		StringBuilder otpBuilder = new StringBuilder(length);

		for (int i = 0; i < length; i++) {
			int randomIndex = random.nextInt(10);
			otpBuilder.append(randomIndex);
		}

		return otpBuilder.toString();
	}

	@Override
	public boolean checkOtp(String mail, Model model) {
		LandRecordAdminDto check = findByMail(mail, model);
		if (check != null) {
			String otp = generateOtp(4);
			System.out.println("checkOtp in service line 89  " + otp);
			model.addAttribute("otp", otp);
			boolean up = repo.updateOtp(otp, mail, model);
			System.out.println("checkOtp in service line 92  " + up);
			boolean otpsender = otpSend(otp, mail, model);
			System.out.println("checkOtp in service line 94 " + otpsender);
			return true;

		}
		model.addAttribute("findEmail", "Please Enter Email");
		return false;

	}

	@Override
	public LandRecordAdminDto findByOtp(String otp, Model model) {
		try {
			if (otp != null) {
				LandRecordAdminDto list = repo.findByOtp(otp);
				System.out.println("111111" + list.getAdminName());
				model.addAttribute("AdminNames", list.getAdminName());
				if (list.getOtp().equals(otp)) {
					return list;
				}
				model.addAttribute("findOtp2", "otp not matched");
				return null;

			}
		} catch (NoResultException e) {
			System.out.println("dto is a null");
			model.addAttribute("findOtp1", "worng otp");
			return null;

		}
		model.addAttribute("findotp", "notfound");
		return null;
	}

	@Override
	public boolean otpSend(String otp, String Email, Model model) {

		String senderEmail = "ulaga774xworkz@outlook.com";
		String senderPassword = "ulaga007";
		String recipientEmail = Email;
		String subject = "Your OTP Code";
		String messageText = "Your OTP code is: " + otp + "it valid for 10 mits only";
		System.out.println(otp);

		// Set up JavaMail properties
		Properties properties = new Properties();
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.host", "smtp.office365.com");
		properties.put("mail.smtp.port", "587");

		// Create a session with authentication
		Session session = Session.getInstance(properties, new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(senderEmail, senderPassword);
			}
		});

		try {
			// Create a MimeMessage object
			Message message = new MimeMessage(session);

			// Set the sender, recipient, subject, and message body
			message.setFrom(new InternetAddress(senderEmail));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipientEmail));
			message.setSubject(subject);
			message.setText(messageText);

			// Send the email
			Transport.send(message);

			System.out.println("OTP email sent successfully!");
		} catch (MessagingException e) {
			e.printStackTrace();
		}

		return true;
	}

}
