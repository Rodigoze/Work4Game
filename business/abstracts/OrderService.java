package business.abstracts;

import entities.concretes.Order;

public interface OrderService {
	void add(Order order);
	void update(Order order);
	void delete(Order order);
}
