package memberRegistrationSystem.business.concretes;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import memberRegistrationSystem.business.abstracts.AuthService;
import memberRegistrationSystem.business.abstracts.UserService;
import memberRegistrationSystem.business.abstracts.ValidityService;
import memberRegistrationSystem.core.abstracts.RegisterService;
import memberRegistrationSystem.dataAccess.abstracts.UserDao;
import memberRegistrationSystem.entities.concretes.User;

public class UserManager implements UserService{
	
	private AuthService authService;
	private UserDao userDao;
	private RegisterService registerService;
	

	public UserManager(AuthService authService, UserDao userDao, RegisterService registerService) {
		this.authService = authService;
		this.userDao = userDao;
		this.registerService = registerService;
	}


	@Override
	public void register(User user) {
		ValidityService validityService = new ValidityManager(userDao);
		
		if(validityService.isValid(user.getEmail()) && authService.emailCheck(user.getEmail()) && 
				authService.firstNameCheck(user.getFirstName()) && 
				authService.lastNameCheck(user.getLastName()) &&
				authService.passwordCheck(user.getPassword())){
			userDao.add(user);
			registerService.register();
			
			System.out.println(user.getEmail() + " adresine dogrulama e-postasi gönderildi.");
			System.out.println(user.getFirstName() + " " + user.getLastName() + " üyeliginiz tamamlanmistir.");
		}
		System.out.println("---------------------------------");
		
	}


	@Override
	public void SignIn(String email, String password) {
		
		for (int i=0; i<userDao.getAll().size(); i++){
            if (userDao.getAll().get(i).getEmail().equals(email) &&
                userDao.getAll().get(i).getPassword().equals(password)) {
            	System.out.println("Giris Yapildi.");
            	System.out.println("---------------------------------");
                return;
            }
        }
        System.out.println("E-mail veya Parola Hatasi!");
        System.out.println("---------------------------------");
	}
}