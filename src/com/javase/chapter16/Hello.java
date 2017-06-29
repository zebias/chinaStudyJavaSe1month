package com.javase.chapter16;

public class Hello extends As{
	
	static String name1 = new String("ABCDE");
	static String name2 = "ABCDE";
	
	private int a = 1;
	public class Inner{       //没有接收
		public void show(){
			int a = 2;
			System.out.println(a);
			System.out.println(Hello.this.a);
		}
	}

	public static void main(String[] args) {
		Hello hello = new Hello();
		Inner i1 = hello.new Inner();
		i1.show();
		
		int[] a  = new int[3];
		System.out.println(a[2]);
		
		As as = new Hello();
		System.out.println(as.a1);
		
		Hello hello2 = new Hello();
		hello2.Q();

		System.out.println(name1 == name2);
		 method2("av");
		System.out.println(name1);
		
	}
    int maxElements;
	 void Q(){

         //maxElements = 100;
           System.out.println(maxElements);
      }
	
	 public static void method2(String name){
			Hello.name1 = "aaa";
			System.out.println(name);
		}
}

class As{
	int a1 ;
}
