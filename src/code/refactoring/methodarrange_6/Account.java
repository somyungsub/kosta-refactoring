package code.refactoring.methodarrange_6;

public class Account {
	
	public Account() {

	}
	
	public int gamma (int inputVal, int quantity, int yearToDate) {
		return new Gamma(this, inputVal, quantity, yearToDate).computeGamma();
		
//		int importantValue1 = (inputVal * quantity) + delta();
//		int importantValue2 = (inputVal * yearToDate) + 100;
//		
//		if ((yearToDate - importantValue1) > 100)
//			importantValue2 -= 20;
//		int importantValue3 = importantValue2 * 7;
//		
//		// 중략 ...		
//		
//		return importantValue3 -2 * importantValue1;
		
	}

	public int delta() {
		// TODO Auto-generated method stub
		return 0;
	}

}
