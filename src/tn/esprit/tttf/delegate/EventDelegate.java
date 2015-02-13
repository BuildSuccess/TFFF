package tn.esprit.tttf.delegate;

import tn.esprit.tttf.service.ServiceLocator;
import Services.interfaces.EventServicesRemote;
import domain.Event;

public class EventDelegate {

	public static String jndi = "/PI_Server/EventServices!Services.interfaces.EventServicesRemote";

	public static EventServicesRemote getProxy() {
		EventServicesRemote remote = null;
		if (remote == null)
			remote = (EventServicesRemote) ServiceLocator.getInstance()
					.getProxy(jndi);
		return remote;
	}

	

	public static Boolean doAddEvent(Event event) {
		return getProxy().addEvent(event);
	}

	public static Boolean doDeleteEvent(Integer id) {
		return getProxy().deleteEvent(id);
	}

	public static Boolean doUpdateEvent(Event event) {
		return getProxy().updateEvent(event);
	}
	
	public static Event findEventById(Integer id){
		return getProxy().findEventByGameId(id);

}	
    public static Event findEventByGameId(Integer id){
    	return getProxy().findEventByGameId(id);
    }
}
