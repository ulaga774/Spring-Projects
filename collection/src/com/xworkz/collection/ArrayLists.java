import java.util.Random;

public class ArrayLists {

	public static String generateRandomOTP(int length) {

		String characters = "0123456789";

		Random random = new Random();

		StringBuilder otpBuilder = new StringBuilder(length);

		for (int i = 0; i < length; i++) {
			int randomIndex = random.nextInt(characters.length());
			char randomChar = characters.charAt(randomIndex);
			otpBuilder.append(randomChar);
		}

		return otpBuilder.toString();
	}

	public static void main(String[] args) {
		int otpLength = 6; // You can change the OTP length as needed
		String otp = generateRandomOTP(otpLength);
		System.out.println("Random OTP: " + otp);
	}
}
