package com.javase.chapter13;

public class Test01 {
	//�������
	public static void main(String[] args) {
		Test01 test01 = new Test01();
		Test02 test02 = new Test02();
		Test03 test03 = new Test03();
		test01.test();
		
		//����2 :�׳��쳣�ڵ����쳣�������Ĵ��봦��
		try{
		test02.test021();
		} catch(Exception e){
			System.out.println("���Ƿ���2����ʱ����");
			e.printStackTrace();
		}
		
		//����3:�ڷ����ڴ������쳣���׳�,�ڵ���ʱ���ٴδ���
		try{
		test03.test031();
		} catch(Exception e){
			System.out.println("���Ƿ���3���δ���");
			e.printStackTrace();
		}
	}
	
	public void test(){
		int i  = 3;
		int j = 0;
		if(j==0){
			//����1,�쳣��Դͷ 
			//��������
			try{
			System.out.println("1");
			throw new Exception();
			
			} catch(Exception e){
				
				//e.printStackTrace();
			}finally{
				System.out.println("�Ҿ���Ҫ����");
			}
		}else{
			System.out.println("2");
		}
	}
	
	
	
}
