package code.refactoring.methodarrange_1;

import java.util.Enumeration;
import java.util.Vector;

public class Owe {

	private String _name;
	private Vector _orders = new Vector();

	public Owe(String _name) {
		this._name = _name;
	}

	public void addOrder(Order arg) {
		_orders.addElement(arg);
	}

	public void printOwing(double previousAmount) {

//		Enumeration e = _orders.elements();
//		double outstanding = previousAmount * 1.2;
//		printBanner();

		// 외상액 계산
//		outstanding = calculateOwe(outstanding);
//		outstanding = calculateOwe(e, outstanding);

		// 세부내역 출력
//		printOwe(outstanding);
		
		// 최종 리팩토링
		printBanner();												// 기본내용출력
		double outstanding = calculateOwe(previousAmount * 1.2);	// 외상액 계산	
		printOwe(calculateOwe(outstanding));						// 세부내역 출력
	}

	private void printBanner() {
		System.out.println("************************");
		System.out.println("*******고객 외상*******");
		System.out.println("************************");
	}
	
	private double calculateOwe(double outstanding) {
		Enumeration e = _orders.elements();
		while (e.hasMoreElements()) {
			Order each = (Order) e.nextElement();
			outstanding += each.getAmount();
		}
		return outstanding;
	}
	
	private void printOwe(double outstanding) {
		System.out.println("name: " + _name);
		System.out.println("amount: " + outstanding);
	}
}
