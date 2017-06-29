package com.javase.chapter16;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
public class RandomTest {
	public static void main(String[] args) {
		
		
		//随机数
		Random random = new Random();
		int a = random.nextInt(3);
		System.out.println(a);
		
		
		//Date
		Date date = new Date();
		System.out.println(date);
		//获取当前系统时间
		Date date3 = new Date(System.currentTimeMillis());
		System.out.println(date3);
		
		Date date2 = new Date(date.getTime());
		System.out.println(date2);
		
		Date date4 = new Date();
		System.out.println(date4.getTime());
		
		//calendar
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		Calendar calendar2 = Calendar.getInstance(Locale.GERMAN);
		System.out.println(calendar2);
		calendar.set(Calendar.YEAR,2012);
		
		//san 
		Calendar calendar3 = Calendar.getInstance();
		calendar3.set(Calendar.DAY_OF_MONTH,12);
		calendar3.set(2012,11,15,20,15,40);
		calendar3.add(Calendar.DAY_OF_MONTH,1);
		System.out.println(calendar3.get(Calendar.YEAR)+"年"+calendar3.get(Calendar.MONTH)+"月"+calendar3.get(Calendar.DAY_OF_MONTH)+"日");
		
		
		//Calendar
		SimpleDateFormat simple = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
		String str1 = simple.format(calendar3.getTime());
		System.out.println(str1);
		
		//Date格式转换
		SimpleDateFormat simple2 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
		String str = simple2.format(date4);
		System.out.println(str);
		
		//把字符串转换为Date
		String str3 = "2012年12月16日 20时15分40秒";
		try {
			Date d2 = simple.parse(str3);
			System.out.println(d2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
