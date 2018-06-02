package code.refactoring.complex_3;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
	
	private String _name;
	private Vector _rentals = new Vector();
	
	public Customer(String name) {
		_name = name;
	}
	
	public void addRental(Rental arg) {
		_rentals.addElement(arg);
	}
	
	public String getName() {
		return _name;
	}
	
	public String statement() {
//		double totalAmount = 0;
//		int frequentRenterPoints = 0;
		double thisAmount = 0;
		Enumeration rentals = _rentals.elements();
		String result = getName() + " 고객님의 대여기록 \n";
		
		while (rentals.hasMoreElements()) {
			Rental each = (Rental)rentals.nextElement();
			
			// 비디오 종류별 대여료 계산
			thisAmount = each.getRentalCharge();
			
			// 적립포인트를 1포인트 증가
//			frequentRenterPoints += each.getFrequentPoint();
			
			// 이번에 대여하는 비디오 정보와 대여료를 출력
			result += "\t" + each.getMovie().getTitle()+ "\t" + String.valueOf(thisAmount) + "\n";
			
			// 현재까지 누적된 총대여료 
//			totalAmount += thisAmount;
			
			// 푸터행 추가
//			result += "누적 대여료: " + String.valueOf(totalAmount) + "\n";
//			result += "적립 포인트 : " + String.valueOf(frequentRenterPoints) + "\n";
			return result;
		}
		result += "누적 대여료: " + String.valueOf(getTotalCharge()) + "\n";
		result += "적립 포인트 : " + String.valueOf(getFrequentPoint()) + "\n";
		return _name;
	}
	
	// 총 대여료 계산 (외부접근가능)
	public double getTotalCharge() {
		double totalCharge = 0;
		Enumeration rentals = _rentals.elements();
		while (rentals.hasMoreElements()) {
			Rental each = (Rental)rentals.nextElement();
			// 비디오 종류별 대여료 계산
			totalCharge += each.getRentalCharge();
		}
		return totalCharge;
	}

	// 총 포인트 계산 (외부접근가능)
	public double getFrequentPoint() {
		int frequentRenterPoints = 0;
		Enumeration rentals = _rentals.elements();
		while (rentals.hasMoreElements()) {
			Rental each = (Rental)rentals.nextElement();
			// 비디오 종류별 포인트 계산
			frequentRenterPoints += each.getFrequentPoint();
		}
		return frequentRenterPoints;
	}
}
