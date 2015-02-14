package tn.esprit.tttf.delegate;

import java.util.List;

import tn.esprit.tttf.service.ServiceLocator;

import Services.interfaces.PlayerServicesRemote;

import domain.Club;
import domain.Player;

public class PlayerDelegate {

	public static String jndi = "/PI_Server/PlayerServices!Services.interfaces.PlayerServicesRemote";

	public static PlayerServicesRemote getProxy() {
		PlayerServicesRemote remote = null;
		if (remote == null)
			remote = (PlayerServicesRemote) ServiceLocator
					.getInstance().getProxy(jndi);
		return remote;
	}

	public static Boolean addPlayer(Player player) {
		return getProxy().addPlayer(player);
	}

	public static Boolean deletePlayer(Integer id) {
		return getProxy().deletePlayer(id);
	}

	public static Player findPlayerById(Integer id) {
		return getProxy().findPlayerById(id);
	}

	public static Boolean updatePlayer(Player player) {
		return getProxy().updatePlayer(player);
	}

	public static List<Player> findPlayersByTeam(Club club) {
		return getProxy().findPlayersByTeam(club);
	}

}
