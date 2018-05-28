package code.refactoring.classmove_2;

public class Account {
	
	private AccountType _type = new AccountType();
	
	public Account(double rate) {
		_type.set_interestRate(rate);
	}
	
	public double interestForAmount_days(double amount, int days) {
		return _type.get_interestRate() * amount * days / 365;
	}

}
