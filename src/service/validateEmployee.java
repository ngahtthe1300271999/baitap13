package service;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

import exception.BirthDayException;
import exception.EmailException;
import exception.PhoneException;

public class validateEmployee {
	static Scanner sc = new Scanner(System.in);
	private static Pattern EMAIL_PATTERN = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
			Pattern.CASE_INSENSITIVE);
	private static Pattern PHONE_PATTERN = Pattern.compile("^(84|0[3|5|7|8|9])+([0-9]{8})$");

	public Date validateBirthDay() throws BirthDayException {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
		simpleDateFormat.setLenient(false);
		while (true) {
			try {
				String birthDay = sc.nextLine();
				Date date = simpleDateFormat.parse(birthDay);
				return date;
			} catch (Exception ex) {
				throw new BirthDayException(ex.getMessage());
				// System.out.println("Enter again");
			}
		}
	}

	public String validateEmail() throws EmailException {
		while (true) {
			String email = sc.nextLine();
			if (EMAIL_PATTERN.matcher(email).matches()) {
				return email;
			} else {
				throw new EmailException();
				// System.out.println("Enter again");
			}
		}
	}

	public String validatePhone() throws PhoneException {
		// CharSequence sequence = (CharSequence) String.valueOf(phone);
		while (true) {
			String phone = sc.nextLine();
			if (PHONE_PATTERN.matcher(phone).matches()) {
				return phone;
			} else {
				throw new PhoneException();
				// System.out.println("Enter again");
			}
		}
	}

	public int validateInt() {
		while (true) {
			try {
				int var = sc.nextInt();
				return var;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	public String validateString() {
		while (true) {
			String var = sc.nextLine();
			if (var.isBlank() || var.isEmpty()) {
				throw new NullPointerException();
				// System.out.println("Enter again");
			} else {
				return var;
			}
		}
	}
}
