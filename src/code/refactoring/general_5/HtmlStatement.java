package code.refactoring.general_5;

import java.util.Enumeration;
import java.util.Vector;

public class HtmlStatement {
	
	private Vector _rentals = new Vector();
	private String _name;
	
	public String statement() {
		String result = "<H1><EM>" + getName() + " ������ �뿩 ���  </EM></H1><P>\n";
		Enumeration rentals = _rentals .elements();
		
		while(rentals.hasMoreElements()) {
			Rental each = (Rental)rentals.nextElement();
			// �̹��� �뿩�ϴ� ���� ������ �뿩�Ḧ ���
			result += each.getMovie().getTitle()+ ": " + String.valueOf(each.getCharge()) + "<BR>\n";
		}
		
		result += "<P>���� �뿩��: <EM>" + String.valueOf(getTotalCharge()) + "</EM><P>\n";
		result += "<P>���� ����Ʈ: <EM>" + String.valueOf(getTotalFrequentRenterPoints()) + "</EM><P>\n";
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
