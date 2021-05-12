package Adapters;

import java.rmi.RemoteException;

import Abstract.*;
import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublic;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;
public class mernisService implements gamerCheckService {

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		KPSPublicSoap mernisCheck = new KPSPublicSoapProxy();

		try {
			boolean result=mernisCheck.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalId()), 
					gamer.getFirstName().toUpperCase(), 
					gamer.getLastName().toUpperCase(), 
					gamer.getYearOfBirth());
			return result;
		} 
		catch (NumberFormatException exception) {
			exception.printStackTrace();
		} 
		catch (RemoteException exception) {
			exception.printStackTrace();
		}
		return false;
	}

}
