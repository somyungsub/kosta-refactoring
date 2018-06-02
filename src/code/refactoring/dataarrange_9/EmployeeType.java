package code.refactoring.dataarrange_9;

public abstract class EmployeeType {
	
	abstract int payAmount();
	abstract int getTypeCode();
	
	static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;
    
	int  _monthlySalary=1, _commission=1,  _bonus=1;
	
	public static EmployeeType setType(int _type) {
		switch (_type) {
		case ENGINEER:
			return new Engineer();
//			return _monthlySalary;
		case SALESMAN:
			return new Salesman();
//			return _monthlySalary + _commission;
		case MANAGER:
			return new Manager();
//			return _monthlySalary + _bonus;
		default:
			throw new RuntimeException("Incorrect Employee");
		}
	}
}
