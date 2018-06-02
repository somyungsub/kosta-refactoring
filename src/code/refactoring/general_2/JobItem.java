package code.refactoring.general_2;

public class JobItem {
	
//	private Employee _employee;
	private int _unitPrice;
	private int _quantity;
	private boolean _isLabor;

	public JobItem(int unitPrice, int quantity) {
		_unitPrice = unitPrice;
		_quantity = quantity;
//		_isLabor = isLabor;
//		_employee = employee;
	}
	
	public int getTotalPrice() {
		return getUnitPrice() * _quantity;
	}
	
	public int getUnitPrice() {
		return  _unitPrice;
	}
	
	public int getQuantity() {
		return _quantity;
	}
	
}
