package code.refactoring.dataarrange_9;

public class Manager extends EmployeeType{
	@Override
	int payAmount() {
		// TODO Auto-generated method stub
		return _monthlySalary + _bonus;
	}

	@Override
	int getTypeCode() {
		// TODO Auto-generated method stub
		return MANAGER;
	}
}
