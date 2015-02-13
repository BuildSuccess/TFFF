package tn.esprit.tttf.delegate;

import java.util.List;

import tn.esprit.tttf.service.ServiceLocator;
import Services.interfaces.GameServicesRemote;
import domain.Event;
import domain.Game;

public class GameDelegate {

	public static String jndi = "/PI_Server/GameServices!Services.interfaces.GameServicesRemote";

	public static GameServicesRemote getProxy() {
		GameServicesRemote remote = null;
		if (remote == null)
			remote = (GameServicesRemote) ServiceLocator.getInstance()
					.getProxy(jndi);
		return remote;
	}

	

	public static Boolean doAddGame(Game game) {
		return getProxy().addGame(game);
	}

	public static Boolean doDeleteGame(Integer id) {
		return getProxy().deleteGame(id);
	}

	public static Boolean doUpdateGame(Game game) {
		return getProxy().updateGame(game);
	}
	
	public static Game findGameById(Integer id){
		return getProxy().findGameById(id);

}	
    public static List<Game> findGamesByEvent(Event event){
    	return getProxy().findGamesByEvent(event);
    	
    }
}
