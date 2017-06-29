package com.javase.chapter17;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateStudy {
	public static void main(String[] args) {
		
		//获取当前系统时间
		System.out.println(new Date(System.currentTimeMillis()));
		
		//通过Date来改变当前系统时间显示格式
		System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(new Date(System.currentTimeMillis())));
		
		//卡栏达(calendar)
		System.out.println(Calendar.getInstance());
		SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日 hh时mm分ss秒");
		Date date = Calendar.getInstance().getTime();
		System.out.println(format.format(date));
		System.out.println(date);
	}
}
