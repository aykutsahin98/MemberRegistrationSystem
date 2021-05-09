package memberRegistrationSystem.business.abstracts;

public interface AuthService {
	
	boolean emailCheck(String email);
	boolean firstNameCheck(String firstName);
	boolean lastNameCheck(String lastName);
	boolean passwordCheck(String password);
}
