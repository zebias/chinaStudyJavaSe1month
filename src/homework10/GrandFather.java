package homework10;


/**
 * 
 * 1、创建GrandFather类，其中包括
	a)属性：姓名（name），年龄（age）
	b)方法getGrandFather()：显示爷爷的信息
	c)构造方法：给爷爷的姓名，年龄赋值

	2、创建Father类，继承Grandfather类
	a)属性：除了继承爷爷的属性以外，还要增加自己的属性：“职业”(occupation)
	b)构造方法：显式调用父类的构造方法，为Father类的姓名和年龄赋初始值。再为职业输入初始值。
	c)方法getFather(): 显示父亲的相关信息

	3、创建ClassMain类，定义main()方法，构造GrandFather类的对象和Father类的对象，并分别显示详细信息

 * 
 * @author zebias
 *
 */
public class GrandFather {
	private String name;
	private int age;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

	//构造方法(有参)
	public GrandFather(String name,int age) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
		
	}
	
	public void getGrandFather(){

		System.out.println("姓名:"+getName());
		System.out.println("年龄:"+getAge());
		System.out.println("------------------------");
	}
	
	public GrandFather(){}
	
	
	
}
