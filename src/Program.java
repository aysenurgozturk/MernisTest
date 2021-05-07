
import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Adapters.MernisServiceAdapters;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;
public class Program {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BaseCustomerManager customerManager =new StarbucksCustomerManager(new MernisServiceAdapters());
		customerManager.Save(new Customer(1,"AYÞENUR","GÖZTÜRK",1999,"123456789"));

	}

}
