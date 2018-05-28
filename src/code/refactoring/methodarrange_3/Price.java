package code.refactoring.methodarrange_3;

public class Price {
	
	private int _quantity;
	private int _itemPrice;
	
	public Price(int quantity, int itemPrice) {
		this._quantity = quantity;
		this._itemPrice = itemPrice;
	}

	public double price() {
		
		//결제액(price) = 총구매액(base price) - 대량구매할인(discount) + 배송료(shipping)
		final int basePrice = _quantity * _itemPrice;
		final double discount = Math.max(0,  _quantity - 500) * _itemPrice * 0.05;
		final double shipPrice = Math.min(basePrice * 0.1,  1000.0);
		
		return basePrice - discount + shipPrice;
	}
}
