package code.refactoring.dataarrange_9;

public class Employee {

//	private int _type;	// 분류코드
	private EmployeeType _type;	// 분류코드
//    static final int ENGINEER = 0;
//    static final int SALESMAN = 1;
//    static final int MANAGER = 2;
//    int  _monthlySalary=1, _commission=1,  _bonus=1;

    public int get_type() {
		return _type.getTypeCode();
	}

	public void set_type(int _type) {
		this._type = EmployeeType.setType(_type);
//		this._type = _type;
	}
	
//    public Employee(int type) {
//    	_type = type;
//    }
    
	int payAmount() {
		return _type.payAmount();
//        switch (_type) {
//            case ENGINEER:
//               return _monthlySalary;
//            case SALESMAN:
//               return _monthlySalary + _commission;
//            case MANAGER:
//               return _monthlySalary + _bonus;
//            default:
//               throw new RuntimeException("Incorrect Employee");
//        }
    }
}
