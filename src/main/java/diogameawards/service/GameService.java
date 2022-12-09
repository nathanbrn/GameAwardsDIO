package diogameawards.service;

import java.util.List;

import diogameawards.domain.model.Game;

public interface GameService {

	List<Game> findAll();
	
	Game findById(Long Id);
	
	void insert(Game game);
	
	void update(Long Id, Game game);
	
	void delete(Long Id);
}
