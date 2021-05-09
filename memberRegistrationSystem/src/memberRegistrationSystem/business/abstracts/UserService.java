package memberRegistrationSystem.business.abstracts;

import java.util.List;

import memberRegistrationSystem.entities.concretes.User;

public interface UserService {
	
	void register(User user);
	void SignIn(String email, String password);
	

}
