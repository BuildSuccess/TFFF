package tn.esprit.tttf.delegate;

import tn.esprit.tttf.service.ServiceLocator;
import Services.interfaces.AntiDopingResponsibleServicesRemote;
import domain.AntiDopingResponsible;

public class AntiDopingResponsibleDelegate {

	public static String jndi = "/PI_Server/AntiDopingResponsibleServices!Services.interfaces.AntiDopingResponsibleServicesRemote";

	public static AntiDopingResponsibleServicesRemote getProxy() {
		AntiDopingResponsibleServicesRemote remote = null;
		if (remote == null)
			remote = (AntiDopingResponsibleServicesRemote) ServiceLocator
					.getInstance().getProxy(jndi);
		return remote;
	}

	public static Boolean doAddAntiDopingResponsible(
			AntiDopingResponsible antiDopingResponsible) {
		return getProxy().addAntiDopingResponsible(antiDopingResponsible);
	}

	public static Boolean doDeleteAntiDopingResponsible(Integer id) {
		return getProxy().deleteAntiDopingResponsible(id);
	}

	public static AntiDopingResponsible doFindAntiDopingResponsibleById(
			Integer id) {
		return getProxy().findAntiDopingResponsibleById(id);
	}

	public static Boolean doUpdatePlayer(
			AntiDopingResponsible antiDopingResponsible) {
		return getProxy().updatePlayer(antiDopingResponsible);
	}

}
