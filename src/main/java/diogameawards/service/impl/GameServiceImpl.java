package diogameawards.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import diogameawards.domain.model.Game;
import diogameawards.domain.model.GameRepository;
import diogameawards.service.GameService;
import diogameawards.service.exception.NoContentException;

@Service
public class GameServiceImpl implements GameService {

	@Autowired
	private GameRepository repository;
	
	@Override
	public List<Game> findAll() {
		List<Game> games = repository.findAll();
		return games;
	}

	@Override
	public Game findById(Long Id) {
		Optional<Game> game = repository.findById(Id);
		return game.orElseThrow(() -> new NoContentException());
	}

	@Override
	public void insert(Game game) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Long Id, Game game) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Long Id) {
		// TODO Auto-generated method stub
		
	}

}
