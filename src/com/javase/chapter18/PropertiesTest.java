package com.javase.chapter18;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.Scanner;

public class PropertiesTest {
	public static void main(String[] args) {
	
		//���ʻ�
		Locale locale1 = new Locale("zh","CN");
		Locale locale2 = new Locale("en","US");
		
		//��ȡproperties�ļ�
		ResourceBundle rb1 = ResourceBundle.getBundle("message",locale1);
		ResourceBundle rb2 = ResourceBundle.getBundle("message",locale2);
		
		System.out.println(rb1.getString("msg_login_successfully"));
		System.out.println(rb2.getString("msg_login_fail"));
		
		
		//����Properties����
		Properties properties = new Properties();
		
		//properties�ļ�����
		try {
			properties.load(new InputStreamReader(PropertiesTest.class.getResourceAsStream("../../../message.properties")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//��ȡ�û���������
		Scanner scan = new Scanner(System.in);
		System.out.println("������:");
		String wenzi = scan.next();
		if(wenzi.equals("xxx")){
			System.out.println(properties.getProperty("msg_login_successfully"));
		}else{
			System.out.println(properties.getProperty("msg_login_fail"));
		}
		scan.close();
		
	}
}
