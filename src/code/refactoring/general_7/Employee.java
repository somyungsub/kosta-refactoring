package code.refactoring.general_7;

public class Employee {
	
	Person _person = new Person();
	
	public String getName() {
		return _person.getName();
	}
	public void setName(String arg) {
		_person.setName(arg);
	}
	public String toString() {
		return "Employee : " + _person.getLastName();
	}

}
