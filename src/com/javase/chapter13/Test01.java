package com.javase.chapter13;

public class Test01 {
	//程序入口
	public static void main(String[] args) {
		Test01 test01 = new Test01();
		Test02 test02 = new Test02();
		Test03 test03 = new Test03();
		test01.test();
		
		//方法2 :抛出异常在调用异常处方法的代码处理
		try{
		test02.test021();
		} catch(Exception e){
			System.out.println("我是方法2调用时候处理");
			e.printStackTrace();
		}
		
		//方法3:在方法内处理了异常并抛出,在调用时候再次处理
		try{
		test03.test031();
		} catch(Exception e){
			System.out.println("我是方法3二次处理");
			e.printStackTrace();
		}
	}
	
	public void test(){
		int i  = 3;
		int j = 0;
		if(j==0){
			//方法1,异常的源头 
			//当场处理
			try{
			System.out.println("1");
			throw new Exception();
			
			} catch(Exception e){
				
				//e.printStackTrace();
			}finally{
				System.out.println("我就是要出来");
			}
		}else{
			System.out.println("2");
		}
	}
	
	
	
}
