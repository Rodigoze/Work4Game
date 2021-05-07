package business.concretes;

import business.abstracts.UserCheckService;
import entities.concretes.User;

public class UserCheckManager  implements UserCheckService {

	@Override
	public boolean checkIfRealPerson(User user) {	
		return true;
	}

	
}


