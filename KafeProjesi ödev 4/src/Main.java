import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCust�merManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
//		 BaseCustomerManager baseCustomerManager= new NeroCustomerManager();
		 BaseCustomerManager base1CustomerManager= new StarbucksCust�merManager(new MernisServiceAdapter());
		 
		 Customer customer = new Customer();
		 customer.setId(1);
		 customer.setFirstName("Sercan");
		 customer.setLastName("Ba�aran");
		 customer.setDateOfBirth(LocalDate.of(1988,10,04));
		 customer.setNationalityId("646465484965);
		 
		 base1CustomerManager.save(customer);

	}

}

