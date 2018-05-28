package code.refactoring.classmove_3;

public class Person {
	
	private String name;
	private String officeAreaCode;
	TelephoneNumber telephoneNumber = new TelephoneNumber();
	
	public String getOfficeAreaCode() {
		return officeAreaCode;
	}
	public void setOfficeAreaCode(String officeAreaCode) {
		this.officeAreaCode = officeAreaCode;
	}
	public String getOfficeNumber() {
		return telephoneNumber.getOfficeNumber();
	}
	public void setOfficeNumber(String officeNumber) {
		telephoneNumber.setOfficeNumber(officeNumber);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getTelephoneNumber() {
		return ("(" + officeAreaCode + ")" + telephoneNumber.getOfficeNumber());
	}
}
