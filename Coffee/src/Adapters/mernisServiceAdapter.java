package Adapters;

import Coffee.Abstract.customerCheckService;
import Coffee.Entities.Customer;
import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class mernisServiceAdapter implements customerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		KPSPublicSoap mernisCheck = new KPSPublicSoapProxy();

		try {
					boolean result=mernisCheck.TCKimlikNoDogrula
							(Long.parseLong(customer.getNationalId()), 
							customer.getFirstName().toUpperCase(), 
							customer.getLastName().toUpperCase(), 
							customer.getDateOfBirth());
							return result;
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

		}
}
