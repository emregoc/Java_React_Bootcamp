package Adapters;

import java.rmi.RemoteException;

import Abstract.CustomerCheckService;
import Entities.Customer;
import MernisServiceReference.KPSPublic;
import MernisServiceReference.KPSPublicSoap;
import MernisServiceReference.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy(); 
			return client.TCKimlikNoDogrula(customer.getNationalId(), customer.getFirstName(), 
					customer.getLastName(), customer.getDateOfBirth()); 
			
	}
}
