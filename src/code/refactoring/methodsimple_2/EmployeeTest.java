package code.refactoring.methodsimple_2;

public class EmployeeTest {
	
	public static void main(String[] args) { 
		Employee kim=new Employee();
//		kim.tenPercentRaise();
//		kim.fivePercentRaise();
		kim.percentRaise(0.05);
		kim.percentRaise(0.1);
		kim.baseCharge();
	}
}
