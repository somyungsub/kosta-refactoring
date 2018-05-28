package code.refactoring.general_5;

import java.util.Enumeration;
import java.util.Vector;

public class TextStatement {
	
	private Vector _rentals = new Vector();
	private String _name;
	
	public TextStatement(String name) {
		_name = name;
	}

	public String statement() {
		String result = getName() + " ������ �뿩 ��� \n";
		Enumeration rentals = _rentals .elements();
		
		while(rentals.hasMoreElements()) {
			Rental each = (Rental)rentals.nextElement();
			// �̹��� �뿩�ϴ� ���� ������ �뿩�Ḧ ���
			result += "\t" + each.getMovie().getTitle()+ "\t" + String.valueOf(each.getCharge()) + "\n";
		}
		
		result += "���� �뿩��: " + String.valueOf(getTotalCharge()) + "\n";
		result += "���� ����Ʈ: " + String.valueOf(getTotalFrequentRenterPoints()) + "\n";
		return result;
	}

	private char[] getTotalFrequentRenterPoints() {
		return null;
	}

	private char[] getTotalCharge() {
		return null;
	}

	private String getName() {
		return _name;
	}

}
