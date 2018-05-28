package code.refactoring.methodarrange_2;

public class Price {
	
	private int _quantity;
	private int _itemPrice;
	
	public Price(int quantity, int itemPrice) {
		this._quantity = quantity;
		this._itemPrice = itemPrice;
	}

	public double getPrice() {
		return discountFactor();
	}

	private double discountFactor() {
		if (basePrice() > 1000)
			return basePrice() * 0.95;
		else
			return basePrice() * 0.98;
	}
	
	private int basePrice() {
		return _quantity * _itemPrice;
	}

}
