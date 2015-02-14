package tn.esprit.tttf.delegate;

import tn.esprit.tttf.service.ServiceLocator;
import Services.interfaces.RefereeTrainigSessionServicesRemote;
import domain.RefereeTrainingSession;

public class RefereeTrainingSessionDelegate {

	public static String jndi = "/PI_Server/ClerkServices!Services.interfaces.RefereeTrainigSessionServicesRemote";

	public static RefereeTrainigSessionServicesRemote getProxy() {
		RefereeTrainigSessionServicesRemote remote = null;
		if (remote == null)
			remote = (RefereeTrainigSessionServicesRemote) ServiceLocator.getInstance()
					.getProxy(jndi);
		return remote;
	}

	//public static String doFindRefereeTrainigSessionById() {
	//	return getProxy().findRefereeTrainigSessionById(1);
	//}

	public static Boolean doAddRefereeTrainigSession(RefereeTrainingSession refereeTrainigSession) {
		return getProxy().addRefereeTrainigSession(refereeTrainigSession);
	}

	public static Boolean doDeleteReferee(Integer id) {
		return getProxy().deleteRefereeTrainigSession(id);
	}

	public static Boolean doUpdateRefereeTrainigSession(RefereeTrainingSession refereeTrainigSession) {
		return getProxy().updateRefereeTrainigSession(refereeTrainigSession);
	}

}
