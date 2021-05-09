package memberRegistrationSystem.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import memberRegistrationSystem.dataAccess.abstracts.UserDao;
import memberRegistrationSystem.entities.concretes.User;

public class InMemoryUserDao implements UserDao{
	
	private List<User> users; //kullanýcýlarý liste içinde tutuyoruz

	public InMemoryUserDao() {
		this.users = new ArrayList<User>();
	}

	@Override
	public void add(User user) {
		this.users.add(user);
		System.out.println("Users Added to System : " + user.getFirstName() +""+ user.getLastName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Updated");
		
	}

	@Override
	public List<User> getAll() {
		return this.users;
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

}
