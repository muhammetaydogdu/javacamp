package Concrete;
import Abstract.*;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckService customerCheckService;
	//Yukarýda hangi CustomerCheckService kullanacaðýmýz deðiþkende tutacaðýz.
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		//Burasý parametreli constructor metodumuz.
		//Programcýya hangi check yöntemini kullanacaðýný girmesini söylüyoruz.
		//Parametresiz constructor olmadýðý için bu alan zorunlu.
		this.customerCheckService = customerCheckService;
	}
	

	@Override
	public void save(Customer customer) {
		//Base class'ýmýzdaki save metodunu burada override ediyoruz.
		if(customerCheckService.checkIfRealPerson(customer))
		{
			//customerCheckServicenin ilgili metoduna customer yolluyoruz.
			//True dönerse çalýþacak blok burasý.
			//Direk checkservice belirtmek yerine, classýn kurucu metodunda
			//belirtilen servisi kullanýyoruz. Böylelikle kodumuz baðýmsýz.
			super.save(customer);
			//Doðrulama baþarýlýysa, base class'ýn save metodunu kullanýyoruz.
		}
		else
		{
			System.out.println("Not a valid person");
			//Burayý daha sonra exceptionHandling ile hallet.
		}
	}
	

}
