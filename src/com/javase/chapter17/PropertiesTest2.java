package com.javase.chapter17;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.Scanner;

public class PropertiesTest2 {

	public static void main(String[] args) {
		
		//���ʻ�
		Locale locale1 = new Locale("zh","CN");
		Locale locale2 = new Locale("en","US");
		
		ResourceBundle bundle1 = ResourceBundle.getBundle("message",locale1);
		ResourceBundle bundle2 = ResourceBundle.getBundle("message",locale2);
		
		//���
		
		System.out.println(bundle1.getString("msg_login_successfully"));
		System.out.println(bundle2.getString("msg_login_fail"));
		
		
		//��ȡ�ļ�
		Properties properties = new Properties();
		//�����ļ�(�ļ�·��)�����class�� ��Ҫ�����쳣
		try {
			properties.load(new InputStreamReader(PropertiesTest2.class.getResourceAsStream("../../../message.properties")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		//��ȡ�û���������
		Scanner scan = new Scanner(System.in);
		System.out.println("����������:");
		String name = scan.next();
		if(name.equals("ïʤ")){
			System.out.println(properties.getProperty("msg_login_successfully","Yes,welcome!"));
		}else{
			System.out.println(properties.getProperty("msg_login_fail"));
		}
		scan.close();
	}
}
