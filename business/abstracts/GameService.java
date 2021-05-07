package business.abstracts;

import entities.concretes.Game;

public interface GameService {
	void add(Game game);
	void update(Game game);
	void deleted(Game game);

}
