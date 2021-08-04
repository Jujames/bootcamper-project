package com.organization.mvcproject.service;

import java.util.List;

import com.organization.mvcproject.api.model.Game;
import com.organization.mvcproject.model.GameImpl;

public interface GameService {

	List<GameImpl> retrieveAllGames();


	Game saveGame(Game game);

}
