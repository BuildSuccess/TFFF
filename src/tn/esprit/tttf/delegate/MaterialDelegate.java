package tn.esprit.tttf.delegate;



import tn.esprit.tttf.service.ServiceLocator;
import Services.interfaces.MaterialServicesRemote;

import domain.Material;

public class MaterialDelegate {

	public static String jndi = "/PI_Server/MaterialServices!Services.interfaces.MaterialServicesRemote";

	public static MaterialServicesRemote getProxy() {
		MaterialServicesRemote remote = null;
		if (remote == null)
			remote = (MaterialServicesRemote) ServiceLocator.getInstance()
					.getProxy(jndi);
		return remote;
	}

	

	public static Boolean doAddMaterial(Material material) {
		return getProxy().addMaterial(material);
	}

	public static Boolean doDeleteMaterial(Integer id) {
		return getProxy().deleteMaterial(id);
	}

	public static Boolean doUpdateMaterial(Material material) {
		return getProxy().updateMaterial(material);
	}
	
	public static Material findMaterialById(Integer id){
		return getProxy().findMaterialById(id);

}	
    
}

