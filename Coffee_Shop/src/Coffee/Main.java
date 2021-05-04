package Coffee;
import Coffee.Entities.Customer;
import java.time.LocalDate;
import Coffee.Abstract.baseCustomerManager;
import Coffee.Adapters.mernisServiceAdapter;
import Coffee.Concrete.*;

public class Main {
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		baseCustomerManager customerManager = new starbucksCustomerManager(new mernisServiceAdapter());	
		customerManager.save(new Customer(1,"Dilara","Koca",LocalDate.of(1998, 3, 14),"85795******"));
		/*Customer customer=new Customer(1,"Engin","Demirog",1986,"28861478508");
		customerManager.save(customer);*/
	}
}
