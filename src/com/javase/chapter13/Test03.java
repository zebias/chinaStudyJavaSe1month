package com.javase.chapter13;

public class Test03 {
	//����3.�ȴ����쳣���׳��쳣
		public void test031() throws Exception{
			int i = 3;
			int j = 0;
			if(j==0){
				//�����쳣
				try{
				//�쳣��Դͷ
				throw new Exception();
				} catch (Exception e){
					e.printStackTrace();
					throw e;
				}
			}

			System.out.println("1");
		}
}
