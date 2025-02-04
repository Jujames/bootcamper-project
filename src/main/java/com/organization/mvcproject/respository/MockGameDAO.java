package com.organization.mvcproject.respository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.google.common.collect.ImmutableList;
import com.organization.mvcproject.api.model.Game;
import com.organization.mvcproject.api.model.MockDAOImpl;
import com.organization.mvcproject.model.GameImpl;


@Repository
public class MockGameDAO implements MockDAOImpl {
	private static Long gameId = new Long(0);
	private static Long companyId = new Long(0);
	private static List<GameImpl> games = new ArrayList<>();

	static {
		games = populateGames();
	}

	private static List<GameImpl> populateGames() {

		GameImpl game1 = new GameImpl();
		game1.setId(++gameId);
		game1.setGenre("Sport");
		game1.setName("Rocket League");

		GameImpl game2 = new GameImpl();
		game2.setId(++gameId);
		game2.setGenre("Shooter");
		game2.setName("Halo 3");

		GameImpl game3 = new GameImpl();
		game3.setId(++gameId);
		game3.setGenre("MMORPG");
		game3.setName("Runescape");

		games.add(game1);
		games.add(game2);
		games.add(game3);

		return games;
	}
	
	
	public List<Game> retrieveAllGames() {
		return ImmutableList.copyOf(games);
	}

	public Game saveGame(Game game) {
		game.setId(++gameId); 
		games.add((GameImpl) game);
		return game;
	}


	
	public Game updateGame(Game game) {
		System.out.println(game);
		if(game.getId() != null) {
			Long currentId = game.getId();
			for(int i =0; i< games.size(); i++) {
				if (currentId == games.get(i).getId()) {
					games.set(i,(GameImpl)game);
				}
			}
		}
		return game;
	}
	
	      public Boolean deleteGame(Long id) {
	    	  for(GameImpl game : games) {
	    		  if(game.getId().equals(id)) {
	    			  games.remove(game);
	    			  return true;
	    		  }
	    	  }
	    	  return false;
	      }
}



