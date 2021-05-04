package Coffee.Abstract;

import Coffee.Entities.Customer;

public abstract class baseCustomerManager implements customerService{

	@Override
	public void save(Customer customer) {
		System.out.println("Saved to db :" + customer.getFirstName());		
	}
}
