package code.refactoring.dataarrange_9;

public class EmployeeTest {
	public static void  main(String[] args){
		System.out.println("hello");
//		Employee kim =new  Employee(0);
		Employee kim =new  Employee();
		kim.set_type(0);
		System.out.println( kim.payAmount() );
	}

}
