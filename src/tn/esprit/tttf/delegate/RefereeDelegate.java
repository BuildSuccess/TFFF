package tn.esprit.tttf.delegate;

import tn.esprit.tttf.service.ServiceLocator;
import Services.interfaces.RefereeServicesRemote;
import domain.Referee;

public class RefereeDelegate {

	public static String jndi = "/PI_Server/ClerkServices!Services.interfaces.RefereeServicesRemote";

	public static RefereeServicesRemote getProxy() {
		RefereeServicesRemote remote = null;
		if (remote == null)
			remote = (RefereeServicesRemote) ServiceLocator.getInstance()
					.getProxy(jndi);
		return remote;
	}

	public static String doFindRefereeById() {
		return getProxy().findRefereeById(1).getFirstName();
	}

	public static Boolean doAddReferee(Referee referee) {
		return getProxy().addReferee(referee);
	}

	public static Boolean doDeleteReferee(Integer id) {
		return getProxy().deleteReferee(id);
	}

	public static Boolean doUpdateReferee(Referee referee) {
		return getProxy().updateReferee(referee);
	}

}

