package homework13;

/**
 * ��ҵ1�� ��Ŀ�� ���б�д������֤try/catch/finally���÷���
 * ��֤��ѧ�쳣����ָ���쳣�����ָ�ʽ�쳣������Խ���쳣������ת���쳣��
 * ���㣺�����������쳣���쳣���� �Ѷȣ���
 * 
 * @author Administrator
 *
 */
public class Homework01 {
	
	//����
	
	public  void test(){
		//��֤��ѧ�쳣
		try{
		int i = 1 / 0;
		throw new ArithmeticException();
		}catch(ArithmeticException e){
			e.printStackTrace();
		}
		
		//��ָ���쳣
		String a = null;
		try{
			a.length();
			
		} catch(NullPointerException e){
			e.printStackTrace();
		}
		
		//���ָ�ʽ�쳣
		try{
		String b = "abc";
		Integer.parseInt(b);
		} catch(NumberFormatException e){
			e.printStackTrace();
		}
		
		//����Խ�������쳣
		int[] c = new int[3];
		try{
		c[3]=2;
		} catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		}
		
		//����ת���쳣
		Object object = new Object();
		try{
		String d = (String)object;
		} catch(ClassCastException e){
			e.printStackTrace();
		}
	}

	//main����
	public static void main(String[] args) {
		Homework01 homework01 = new Homework01();
		homework01.test();
	}
}
