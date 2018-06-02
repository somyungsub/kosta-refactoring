package code.refactoring.methodsimple_6;

public class Employee {

	private int _type;
	final int ENGINEER = 0;
	final int SALESMAN = 1;
	final int MANAGER = 2;

	public Employee(int type) {
		_type = type;
	}

	public Employee create(int _type2) {
		switch (_type2) {
		case ENGINEER:
			return (Employee) new Engineer(_type2);
		case SALESMAN:
			return (Employee) new Salesman(_type2);
		case MANAGER:
			return (Employee) new Manager(_type2);
		default:
			throw new IllegalArgumentException("Incorrect type code value");
		}
	}

}
