package code.refactoring.dataarrange_9;

public class Salesman extends EmployeeType{
	@Override
	int payAmount() {
		// TODO Auto-generated method stub
		return _monthlySalary + _commission;
	}

	@Override
	int getTypeCode() {
		// TODO Auto-generated method stub
		return SALESMAN;
	}
}
