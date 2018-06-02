package code.refactoring.methodsimple_7;

public class AccountTest {
	public static void main(String[] args) { 
		Account account= new Account();
//		System.out.println( account.canWithdraw(100) ); // 0
//		System.out.println( account.canWithdraw(100) ); // -1
	
		int amount = 150;
		try {
//			account.canWithdraw(amount);
			account.canWithdrawUserException(amount);
			doTheUsualThing();
		} catch (BalancedException e) {
			System.out.println("Balance --> " + e);
			handleOverdrawn();
		}
		
//		if (account.canWithdraw(amount) == -1)
//			handleOverdrawn();
//		else {
//			account.canWithdraw(amount);
//			doTheUsualThing();
//		}
		
	}

	private static void doTheUsualThing() {
		System.out.println( "doTheUsualThing() -->" ); 
		
	}

	private static void handleOverdrawn() {
		System.out.println( "handleOverdrawn() -->" ); 
		
	}
}
