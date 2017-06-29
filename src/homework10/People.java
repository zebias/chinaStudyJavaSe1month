package homework10;

/**
 * 
 * 
 * 
 * 
 * 创建一个“人”的类，有姓名和年龄，
		有学生和工人继承这个类，他们也有姓名和年龄。
	学生有自己的学习方法，工人有自己的工作方法。
	现在有个学生叫张三，22岁，正在学习，有个工人叫李四，25岁，正在工作。


 * @author Administrator
 *
 */
public class People {
	private String name;
	private int age;
	
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
