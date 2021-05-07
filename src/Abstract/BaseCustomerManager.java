package Abstract;

import java.rmi.RemoteException;

import Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService{

	@Override
	public void Save(Customer customer) throws  Exception {
		// TODO Auto-generated method stub
		System.out.println("Saved to db : "+ customer.getFirstName());
	}
	
}
