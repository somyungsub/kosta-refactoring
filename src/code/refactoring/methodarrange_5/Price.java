package code.refactoring.methodarrange_5;

public class Price {
	
	public int discount (int inputVal, int quantity, int yearToDate) {
		
		int result = inputVal;

	    if (result > 50)  result -= 2;
	    if (quantity > 100) result -= 1;
	    if (yearToDate > 10000) result -= 4;
	    return result;
//	    if (inputVal > 50)  inputVal -= 2;
//	    if (quantity > 100) inputVal -= 1;
//	    if (yearToDate > 10000) inputVal -= 4;
//	    return inputVal;
	}


}
