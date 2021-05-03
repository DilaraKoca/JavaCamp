package Coffee;
import Coffee.Entities.Customer;
import Adapters.mernisServiceAdapter;
import Coffee.Abstract.baseCustomerManager;
import Coffee.Concrete.*;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		baseCustomerManager customerManager = new starbucksCustomerManager(new mernisServiceAdapter());	
		//customerManager.save(new Customer(1,"Dilara","Koca",1989,"359*****"));
		Customer customer=new Customer(1,"Engin","Demirog",1986,"28861478508");
		customerManager.save(customer);
	}

}
