package code.refactoring.dataarrange_9;

public class Engineer extends EmployeeType{

	@Override
	int payAmount() {
		// TODO Auto-generated method stub
		return _monthlySalary;
	}

	@Override
	int getTypeCode() {
		// TODO Auto-generated method stub
		return ENGINEER;
	}
	
}
