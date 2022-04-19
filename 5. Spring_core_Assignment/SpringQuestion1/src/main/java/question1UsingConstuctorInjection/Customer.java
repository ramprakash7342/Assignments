package question1UsingConstuctorInjection;


public class Customer {

	int customerId;
	String customerName;
	long customerContact;
	Address customerAddress;
	
	
	
	public Customer() {
		super();
	}

	public Customer(int customerId, String customerName, long customerContact, Address customerAddress) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerContact = customerContact;
		this.customerAddress = customerAddress;
	}

	public int getCustomerId() {
		return customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public long getCustomerContact() {
		return customerContact;
	}

	public Address getCustomerAddress() {
		return customerAddress;
	}
	
	public void getInfo() {
		System.out.println("Information of Customer:\n"+"   Id : "+getCustomerId()+"\n   name : "+getCustomerName()+"\n   contact : "+getCustomerContact()
		                  +"\nAddress : \n"+"   Street : "+ getCustomerAddress().getStreet()+"\n   city : "+getCustomerAddress().getCity()
				           +"\n   state : "+getCustomerAddress().getState()+"\n   zip : "+getCustomerAddress().getZip()+"\n   country : "+getCustomerAddress().getCountry()
				          );
	}
}
