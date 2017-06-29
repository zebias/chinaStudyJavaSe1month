package homework16;

public class RandomGenerator2 {
	public int generateRandom(int bitnum) {
		int i = 0;
		for (; i <  Math.pow(10, bitnum - 1); i++) {
			
		
		i = (int) (Math.random() * Math.pow(10, bitnum));
		if (i < Math.pow(10, bitnum - 1) && Math.random() != 0) {
			generateRandom(bitnum);
			continue;
		} else {
			break;
		}
		}
		return i;
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			System.out.println(new RandomGenerator2().generateRandom(6));
		}
	}
}
