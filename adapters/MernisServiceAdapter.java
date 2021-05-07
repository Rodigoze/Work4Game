package adapters;

import java.rmi.RemoteException;

import business.abstracts.UserCheckService;
import entities.concretes.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements UserCheckService {

	@Override
	public boolean checkIfRealPerson(User user) {
		KPSPublicSoap soapClient = new KPSPublicSoapProxy();
		boolean result = false;
	
	try {

		result = soapClient.TCKimlikNoDogrula(
				Long.parseLong(user.getNationalityId()), 
				user.getFirstName(), 
				user.getLastName(), 
				user.getBirthYear());
	} catch (NumberFormatException e) {
		e.printStackTrace();
	} catch (RemoteException e) {
		e.printStackTrace();
	}
	return result;

		
	}
	
	
}

