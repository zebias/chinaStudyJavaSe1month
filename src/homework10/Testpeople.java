package homework10;

import java.util.Random;

public class Testpeople {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.study("张三",22);
		
		Worker worker = new Worker("李四", 25);
		worker.work();
		
		
		//		随机数
		Random random = new Random();
		for(int i = 1;i<=100;i++){
		System.out.println("随机数"+random.nextInt(i));

		}
	}

}
