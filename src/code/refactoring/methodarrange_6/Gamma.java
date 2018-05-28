package code.refactoring.methodarrange_6;

public class Gamma {
	private Account account;
	private int inputVal;
	private int quantity;
	private int yearToDate;
	
	public Gamma(Account account, int inputVal, int quantity, int yearToDate) {
		this.account = account;
		this.inputVal = inputVal;
		this.quantity = quantity;
		this.yearToDate = yearToDate;
	}
	
	public int computeGamma() {
		int importantValue1 = (this.inputVal * this.quantity) + account.delta();
		int importantValue2 = (this.inputVal * this.yearToDate) + 100;
		
		if ((this.yearToDate - importantValue1) > 100)
			importantValue2 -= 20;
		int importantValue3 = importantValue2 * 7;
		
		return importantValue3 -2 * importantValue1;
	}
	
	private int delta() {
		return 0;
	}
}
