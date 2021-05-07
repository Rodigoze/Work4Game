package business.abstracts;

import entities.concretes.User;

public interface UserCheckService {
	public boolean checkIfRealPerson(User user);
}
