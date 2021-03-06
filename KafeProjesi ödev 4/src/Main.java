import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustımerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
//		 BaseCustomerManager baseCustomerManager= new NeroCustomerManager();
		 BaseCustomerManager base1CustomerManager= new StarbucksCustımerManager(new MernisServiceAdapter());
		 
		 Customer customer = new Customer();
		 customer.setId(1);
		 customer.setFirstName("Sercan");
		 customer.setLastName("Başaran");
		 customer.setDateOfBirth(LocalDate.of(1988,10,04));
		 customer.setNationalityId("646465484965);
		 
		 baseCustomerManager.save(customer);

	}

}

