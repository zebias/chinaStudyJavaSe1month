package com.javase.chapter13;

public class Test03 {
	//方法3.先处理异常再抛出异常
		public void test031() throws Exception{
			int i = 3;
			int j = 0;
			if(j==0){
				//处理异常
				try{
				//异常的源头
				throw new Exception();
				} catch (Exception e){
					e.printStackTrace();
					throw e;
				}
			}

			System.out.println("1");
		}
}
