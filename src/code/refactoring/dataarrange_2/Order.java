package code.refactoring.dataarrange_2;

public class Order {
	
//	private String _customer;
	
	private Customer customer;

	public Order(String name) {
		this.customer = new Customer(name);
	}
	
	public String getCustomerName() {
		return customer.getName();
	}
	
	public void setCustomerName(String arg) {
		customer.setName(arg);
	}
	
	
	
	
//	public Order (String customer) {
//		_customer = customer;
//	}
//	
//	public String getCustomerName() {
//		return _customer;
//	}
//
//	public void setCustomer(String arg) {
//		_customer = arg;
//	}
	
}
