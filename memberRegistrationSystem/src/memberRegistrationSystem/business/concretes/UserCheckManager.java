package memberRegistrationSystem.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import memberRegistrationSystem.business.abstracts.AuthService;

public class UserCheckManager implements AuthService{

	public UserCheckManager() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean emailCheck(String email) {
		 String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";

	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(email);

	        if(matcher.matches()) {
	            return true;
	        }else if(email.isEmpty()){
	        	System.out.println("Email giriniz.");
	        	return false;
	        }else {
	        	System.out.println("Geçersiz email adresi.");
	            return false;
	        }
	}

	@Override
	public boolean firstNameCheck(String firstName) {
		if(firstName.length() < 2) {
			System.out.println("Adiniz 2 karakterden az olamaz.");
			return false;
		}
		return true;
	}

	@Override
	public boolean lastNameCheck(String lastName) {
		if(lastName.length() < 2) {
			System.out.println("Soyadiniz 2 karakterden az olamaz.");
			return false;
		}
		return true;
	}

	@Override
	public boolean passwordCheck(String password) {
		if(password.isEmpty()) {
			System.out.println("Sifre giriniz.");
			return false;
		}else if(password.length() < 6) {
			System.out.println("Parolaniz 6 karakterden az olamaz.");
			return false;
		}
		return true;
	}

}
