package homework13;

/**
 * 作业1： 题目： 自行编写程序，验证try/catch/finally的用法，
 * 验证数学异常、空指针异常、数字格式异常、索引越界异常、类型转换异常。
 * 考点：常见运行期异常，异常处理 难度：低
 * 
 * @author Administrator
 *
 */
public class Homework01 {
	
	//方法
	
	public  void test(){
		//验证数学异常
		try{
		int i = 1 / 0;
		throw new ArithmeticException();
		}catch(ArithmeticException e){
			e.printStackTrace();
		}
		
		//空指针异常
		String a = null;
		try{
			a.length();
			
		} catch(NullPointerException e){
			e.printStackTrace();
		}
		
		//数字格式异常
		try{
		String b = "abc";
		Integer.parseInt(b);
		} catch(NumberFormatException e){
			e.printStackTrace();
		}
		
		//数组越界索引异常
		int[] c = new int[3];
		try{
		c[3]=2;
		} catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		}
		
		//类型转换异常
		Object object = new Object();
		try{
		String d = (String)object;
		} catch(ClassCastException e){
			e.printStackTrace();
		}
	}

	//main方法
	public static void main(String[] args) {
		Homework01 homework01 = new Homework01();
		homework01.test();
	}
}
