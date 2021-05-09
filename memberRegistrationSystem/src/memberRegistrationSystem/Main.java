package memberRegistrationSystem;

import memberRegistrationSystem.business.concretes.UserCheckManager;
import memberRegistrationSystem.business.concretes.UserManager;
import memberRegistrationSystem.core.concretes.GoogleManagerAdapter;
import memberRegistrationSystem.core.concretes.NoAdapter;
import memberRegistrationSystem.dataAccess.concretes.InMemoryUserDao;
import memberRegistrationSystem.entities.concretes.User;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		User user1 = new User(1, "Aykut", "Sahin", "sahinaykut88@gmail.com", "1234567");
		User user2 = new User(2, "Eren", "T", "eren55n@gmail.com", "123456789");
		User user3 = new User(3, "Ceren", "Gur", "ceren4gmail.com", "1234567");
		User user4 = new User(4, "Esra", "Sevinc", "sevinc@gmail.com", "123");
		
		UserManager userManager = new UserManager(new UserCheckManager(), 
				new InMemoryUserDao(),new NoAdapter()); //Normal Kullanýcý girisi
		
		userManager.register(user1);
		userManager.register(user2);
		userManager.register(user3);
		userManager.register(user4);
		
		UserManager userManager1 = new UserManager(new UserCheckManager(), 
				new InMemoryUserDao(), new GoogleManagerAdapter()); // Google ile giris
		userManager1.register(user1);
		userManager.SignIn("Aykut", "1234567");
		userManager.SignIn("sahinaykut88@gmail.com", "1234567");
	}

}
