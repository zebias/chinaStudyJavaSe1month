package homework16;

import java.util.Random;

/**
 * @author Administrator 2.编写一个随机数生成类 RandomGenerator 有方法： (1)public int
 *         generateRandom(int bitnum) // 参数指定随机数的位数。如bitnum=4, 生成4位的随机数。
 */
public class RandomGenerator {

	public static int generateRandom(int bitnum) {
		Random random = new Random();

		int num =1 ;
		int c = 1;
		int num2 = 0;
		for(int i = 0;i<bitnum;i++){

			int j = random.nextInt(9);
			c=num*j;
			num*=10;
			num2+=c;
		}
		return num2+1000;
		
	}

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
		
		System.out.println(RandomGenerator.generateRandom(4));	
		}
	}
}
