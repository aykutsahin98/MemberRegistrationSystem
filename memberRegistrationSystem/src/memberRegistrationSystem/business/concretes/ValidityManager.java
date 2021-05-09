package memberRegistrationSystem.business.concretes;

import memberRegistrationSystem.business.abstracts.ValidityService;
import memberRegistrationSystem.dataAccess.abstracts.UserDao;
import memberRegistrationSystem.entities.concretes.User;

public class ValidityManager implements ValidityService {

	private UserDao userDao;
	
	public ValidityManager(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public boolean isValid(String email) {
		for(User user : userDao.getAll()) {
			if(email.equals(user.getEmail())) {
				System.out.println("Email adresi zaten kayitli!.");
				return false;
			}
		}
		return true;
	}

}
