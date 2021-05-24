package Concrete;

import Abstract.*;
import Entities.Customer;

public class CustomerManager extends BaseCustomerManager {
	
	CustomerCheckService checkService;
	
	public CustomerManager(CustomerCheckService checkService) {
		this.checkService = checkService;
	}
	
	@Override
	public void save(Customer customer) {
	
		
		
		if(this.checkService.checkIfRealPerson(customer)) {
			//Doðrulama true döndürürse;
			super.save(customer);
		}
		else
		{
			//Doðrulama hatalýysa.
			System.out.println(customer.getFirstName()+" kayýt baþarýsýz. Bilgilerinizi kontrol edip tekrar deneyin.");
		}
		
		
		
	}

}
