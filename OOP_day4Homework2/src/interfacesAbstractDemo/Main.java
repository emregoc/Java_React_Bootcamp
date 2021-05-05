package interfacesAbstractDemo;


import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {

		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1, "Ali", "Veli", "5555", "123456"));
		Customer customer = new Customer();
		customer.setId(2);
		customer.setFirstName("emre");
		customer.setLastName("goc");
		customer.setDateOfBirth("17.10.1995");
		customer.setNationalId("12345678");
		
		customerManager.save(customer);
		
	}

}
