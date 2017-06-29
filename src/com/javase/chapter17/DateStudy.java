package com.javase.chapter17;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateStudy {
	public static void main(String[] args) {
		
		//��ȡ��ǰϵͳʱ��
		System.out.println(new Date(System.currentTimeMillis()));
		
		//ͨ��Date���ı䵱ǰϵͳʱ����ʾ��ʽ
		System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(new Date(System.currentTimeMillis())));
		
		//������(calendar)
		System.out.println(Calendar.getInstance());
		SimpleDateFormat format = new SimpleDateFormat("yyyy��MM��dd�� hhʱmm��ss��");
		Date date = Calendar.getInstance().getTime();
		System.out.println(format.format(date));
		System.out.println(date);
	}
}
