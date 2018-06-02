package code.refactoring.methodsimple_4;

public class Price {
	
	private int _quantity;
	private int _itemPrice;
	
	public Price(int quantity, int itemPrice) {
		this._quantity = quantity;
		this._itemPrice = itemPrice;
	}
	public double getPrice() {
		return discountedPice();
	}

	private double discountedPice() {
		if (_quantity > 100)
			return getBasePrice() * 0.1;
		else
			return getBasePrice() * 0.05;
	}
	
	private int getBasePrice() {
		return _quantity * _itemPrice;
	}
	

}
