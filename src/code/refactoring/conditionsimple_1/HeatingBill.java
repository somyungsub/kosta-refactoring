package code.refactoring.conditionsimple_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class HeatingBill {
	
	private static final String SUMMER_START = "06-01";
	private static final String SUMMER_END = "08-30";
	private double _winterRate = 1.5;
	private double _summerRate = 2;
	private double _winterServiceCharge = 10;
	

	public HeatingBill() {}
	
	public double calculateBills (int quantity, Date date) {
		double charge = 0;
		if (isWinter(date))
			charge  = winterCharge(quantity);
		else charge = summerCharge(quantity);
		
		return charge;
	}

	private double summerCharge(int quantity) {
		return quantity * _summerRate;
	}

	private double winterCharge(int quantity) {
		return quantity * _winterRate + _winterServiceCharge;
	}

	private boolean isWinter(Date date) {
		SimpleDateFormat formatter = new SimpleDateFormat("MM-dd");
		boolean winterFlg = false;
		try {
			Date startDate = formatter.parse(SUMMER_START);
			Date endDate = formatter.parse(SUMMER_END);
			winterFlg = date.compareTo(startDate) < 0 || date.compareTo(endDate) > 0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return winterFlg;
	}
}
