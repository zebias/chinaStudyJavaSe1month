package com.javase.chapter17;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.Scanner;

public class PropertiesTest {

	public static void main(String[] args) {

		// 国际化
		Locale locale1 = new Locale("zh", "CN");
		Locale locale2 = new Locale("en", "US");

		// ResouceBundle
		ResourceBundle rb1 = ResourceBundle.getBundle("message", locale1);
		ResourceBundle rb2 = ResourceBundle.getBundle("message", locale2);

		// 输出
		System.out.println(rb1.getString("msg_login_successfully"));
		System.out.println(rb2.getString("msg_login_successfully"));
		// 获取properties
		Properties properties = new Properties();
		// 调用方法
		try {
			properties.load(new InputStreamReader(PropertiesTest.class.getResourceAsStream("../../../message.properties")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Scanner scan = new Scanner(System.in);
		String s = "";
		System.out.println("请输入");
		s = scan.next();
		if(s.equals("xxx")){
		System.out.println(properties.getProperty("msg_login_successfully"));
		}else{

			System.out.println(properties.getProperty("msg_login_fail"));
		}
		scan.close();
	}
}
