package homework10;

import java.util.Random;

public class Testpeople {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.study("����",22);
		
		Worker worker = new Worker("����", 25);
		worker.work();
		
		
		//		�����
		Random random = new Random();
		for(int i = 1;i<=100;i++){
		System.out.println("�����"+random.nextInt(i));

		}
	}

}
