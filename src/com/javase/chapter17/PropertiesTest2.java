package com.javase.chapter17;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.Scanner;

public class PropertiesTest2 {

	public static void main(String[] args) {
		
		//国际化
		Locale locale1 = new Locale("zh","CN");
		Locale locale2 = new Locale("en","US");
		
		ResourceBundle bundle1 = ResourceBundle.getBundle("message",locale1);
		ResourceBundle bundle2 = ResourceBundle.getBundle("message",locale2);
		
		//输出
		
		System.out.println(bundle1.getString("msg_login_successfully"));
		System.out.println(bundle2.getString("msg_login_fail"));
		
		
		//读取文件
		Properties properties = new Properties();
		//加载文件(文件路径)相对于class的 需要处理异常
		try {
			properties.load(new InputStreamReader(PropertiesTest2.class.getResourceAsStream("../../../message.properties")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		//获取用户键盘输入
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入姓名:");
		String name = scan.next();
		if(name.equals("茂胜")){
			System.out.println(properties.getProperty("msg_login_successfully","Yes,welcome!"));
		}else{
			System.out.println(properties.getProperty("msg_login_fail"));
		}
		scan.close();
	}
}
