package question1UsingSetterInjection;


public class Customer {


	int customerId;
	String customerName;
	long customerContact;
	Address customerAddress;
	
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(long customerContact) {
		this.customerContact = customerContact;
	}
	public Address getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}
	public void getInfo() {
		System.out.println("Information of Customer:\n"+"   Id : "+getCustomerId()+"\n   name : "+getCustomerName()+"\n   contact : "+getCustomerContact()
		                  +"\nAddress : \n"+"   Street : "+ getCustomerAddress().getStreet()+"\n   city : "+getCustomerAddress().getCity()
				           +"\n   state : "+getCustomerAddress().getState()+"\n   zip : "+getCustomerAddress().getZip()+"\n   country : "+getCustomerAddress().getCountry()
				          );
	}
}
