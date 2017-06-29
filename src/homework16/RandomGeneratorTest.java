package homework16;

import java.text.ParseException;
import java.util.Date;

public class RandomGeneratorTest {
	
	public static void main(String[] args) {
		
		
		System.out.println(DateFunction.getCurrentDateTime());
		System.out.println(DateFunction.getCurrentShortDate());
		System.out.println(DateFunction.getCurrentDateTime());
		System.out.println(DateFunction.getCurrentChineseDate());
		try {
			System.out.println(DateFunction.convertToDate("2017-5-2").getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println(DateFunction.convertToLongDate("2015-5-3 12:23:42"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		System.out.println(DateFunction.convertToDateString(new java.sql.Date(new java.util.Date().getTime())));
		System.out.println(DateFunction.convertToDateTimeString(new java.sql.Date(new java.util.Date().getTime())));
	}
}
