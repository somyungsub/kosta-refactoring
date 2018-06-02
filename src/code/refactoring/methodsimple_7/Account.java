package code.refactoring.methodsimple_7;

public class Account {
	
	private int _balance=100;
	void canWithdraw(int amount) {
		
		// 예외처리로 변경
		if (amount > _balance)
			throw new IllegalArgumentException();
		_balance -= amount;
		
//        	return -1;	
//    	else {
//        	_balance -= amount;
//        	return 0;
//    	}
	}

	void canWithdrawUserException(int amount) throws BalancedException{
		if (amount > _balance)
			throw new BalancedException();
		_balance -= amount;
	}
}
