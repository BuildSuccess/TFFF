package tn.esprit.tttf.delegate;

import tn.esprit.tttf.service.ServiceLocator;
import Services.interfaces.ClerkServicesRemote;
import domain.Clerk;

public class ClerckDelegate {

	public static String jndi = "/PI_Server/ClerkServices!Services.interfaces.ClerkServicesRemote";

	public static ClerkServicesRemote getProxy() {
		ClerkServicesRemote remote = null;
		if (remote == null)
			remote = (ClerkServicesRemote) ServiceLocator.getInstance()
					.getProxy(jndi);
		return remote;
	}

	public static String doFindPlayerById() {
		return getProxy().findClerkById(1).getFirstName();
	}

	public static Boolean doAddClerk(Clerk clerk) {
		return getProxy().addClerk(clerk);
	}

	public static Boolean doDeleteClerk(Integer id) {
		return getProxy().deleteClerk(id);
	}

	public static Boolean doUpdateClerk(Clerk clerk) {
		return getProxy().updateClerk(clerk);
	}

	public static Clerk doAuthentificateClerk(String userName, String password) {
		return getProxy().authentificateClerk(userName, password);
	}

}
