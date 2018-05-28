package code.refactoring.methodsimple_7;

public class AccountTest {
	
	public static void main(String[] args) { 
	 
		Account account= new Account();
		System.out.println( account.canWithdraw(100) ); // 0
		System.out.println( account.canWithdraw(100) ); // -1
	
		int amount = 100;
		if (account.canWithdraw(amount) == -1)
			handleOverdrawn();
		else {
			account.canWithdraw(amount);
			doTheUsualThing();
		}
	}

	private static void doTheUsualThing() {
		System.out.println( "doTheUsualThing() -->" ); 
		
	}

	private static void handleOverdrawn() {
		System.out.println( "handleOverdrawn() -->" ); 
		
	}
}
