package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		
		this.customerCheckService = customerCheckService;
		
	}
	
	@Override
	public void save(Customer customer){
		
		if(customerCheckService.checkIfRealPerson(customer)) {
			
			this.save(customer);
		
		}else {
			
			throw new RuntimeException("Not a valid person");
			
		}
		
	}
}
