package Coffee.Concrete;
import Coffee.Abstract.*;
import Coffee.Entities.*;

public class starbucksCustomerManager extends baseCustomerManager   {
	 customerCheckService customerCheckService;
	
	public starbucksCustomerManager(customerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	
	@Override
	public void save(Customer customer) {
		if(customerCheckService.CheckIfRealPerson(customer))
		{
			save(customer);
			System.out.println("Valid person");
			
		}
		else
		{
			System.out.println("Not a valid person");
		}
	}

	

	
}
