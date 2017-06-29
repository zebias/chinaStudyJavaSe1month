package homework12;

import java.util.Scanner;

public class homework02 {
	//程序入口,让jvm调用
	public static void main(String[] args) {
		// 判断输入的是否是9位数QQ号码
		// 用户输入
		Scanner scan = new Scanner(System.in);
		//提示用户键盘输入(循环输入)
		while(true){
			System.out.println("请输入QQ号码:");
			//使用字符串来接收
			String qqNum = scan.next();
			
			//看看输入的字符串长度是否符合要求(字符串.length())
			//如果符合要求再继续
			if(qqNum.length()==9){
				
				//判断输入的字符是否是0开头
				
				if(qqNum.charAt(0)!='0'){
					
					//用一个char数组接收字符
					char[] num = new char[9];
					
					//遍历数组
					for(int i = 0;i<qqNum.length();i++){
						num[i] = qqNum.charAt(i);
						System.out.print(num[i]);
					}
					
					//看看输入的数字是否为纯数字
					for(char num2 : num){
						
						//判断
						if(num2 > 57 || num2 < 48){
							System.out.println("不符合要求,请输入纯数字");
							//结束整个方法
							return;
						}
						
					}
					if(true){
					System.out.println("合法.您输入的是正确的QQ号码");
					scan.close();
					return;
					}
					
				}else{
					System.out.println("您输入的值不能以0开头");
				}
			}else{
				System.out.println("长度不够");
			}

		}
	}
}
