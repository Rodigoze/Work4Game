package business.abstracts;

import entities.concretes.Campaign;
import entities.concretes.Game;
import entities.concretes.Order;
import entities.concretes.User;

public interface SaleService {
	void buy(User user,Game[] games,Order order,Campaign campaign);

}
