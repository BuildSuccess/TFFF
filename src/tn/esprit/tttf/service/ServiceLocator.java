package tn.esprit.tttf.service;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class ServiceLocator {
	private static ServiceLocator instance;
	private Map<String, Object> cache;
	Context context;
	private ServiceLocator()  {
		cache=new HashMap<String, Object>();
		try {
			context = new InitialContext();

		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static ServiceLocator getInstance() {
		if(instance==null)
			instance=new ServiceLocator();
		return instance;
	}
	public Object getProxy(String jndi){
		if(cache.get(jndi)==null){
			try {
				Object object=context.lookup(jndi);
				cache.put(jndi, object);
				return object;
				
			} catch (NamingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return cache.get(jndi);
	}

}
