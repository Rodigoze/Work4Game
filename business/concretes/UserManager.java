package business.concretes;

import business.abstracts.UserService;
import entities.concretes.User;

public class UserManager implements UserService {

	@Override
	public void add(User user) {
		System.out.println(user.getFirstName()+" added");
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName()+" updated");
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName()+" deleted");
		
	}
	

}



