import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustýmerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
//		 BaseCustomerManager baseCustomerManager= new NeroCustomerManager();
		 BaseCustomerManager base1CustomerManager= new StarbucksCustýmerManager(new MernisServiceAdapter());
		 
		 Customer customer = new Customer();
		 customer.setId(1);
		 customer.setFirstName("Sercan");
		 customer.setLastName("Baþaran");
		 customer.setDateOfBirth(LocalDate.of(1988,10,04));
		 customer.setNationalityId("646465484965);
		 
		 base1CustomerManager.save(customer);

	}

}

