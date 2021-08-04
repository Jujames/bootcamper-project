package com.organization.mvcproject.api.model;

import java.util.ArrayList;
import java.util.List;

import com.organization.mvcproject.model.GameImpl;

public interface MockDAOImpl {
	 Game updateGame(Game game);
	 Game saveGame(Game game); 
     List<Game> retrieveAllGames();
     Boolean deleteGame(Long id);
}
