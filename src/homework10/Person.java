package homework10;

/**
 * 
 * 
 * 3.请写Person类，有属性姓名和年龄；
请写出其构造方法，及Setter，Getter方法，需要使用this关键字
 *	要求如下：
 *	String  name;
 *	int  age; 
 *	boolean  gender 
 *	Person  partner。
 *  为Person类写一个marry(Person  p)方法，代表当前对象和p结婚，如若可以结婚，则输出恭贺信息，
 *  否则输出不能结婚原因。要求在另外一个类中写一个主方法，来测试以上程序。
 * （下列情况不能结婚：1，同性；2，未达到结婚年龄，男<24，女<22；3，某一方已婚）
 * 
 * @author Administrator
 *
 */
public class Person {
	private String name;
	private int age;
	private boolean gender;
	private Person partner;
	private String sex;
	
	//构造方法
	public Person(String name,int age,boolean gender,String sex){
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.sex =sex;
	}
	
	//setting和getting
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setGender(boolean gender){
		this.gender = gender;
	}
	
	public boolean getGender(){
		return gender;
	}
	
	public void setPartner(Person partner){
		this.partner = partner;
	}
	
	public Person getPartner(){
		return partner;
	}
	
	public void setSex(String sex){
		this.sex =sex;
	}
	
	public String getSex(){
		return sex;
	}
	
	//方法
	public void marry(Person p){
		  
		if(partner.sex.equals(p.sex)){
			System.out.println("对不起,你们不能结婚!");
		}
		else if(partner.age>24 && p.age>22){
			if(sex.equals("男") == p.sex.equals("女")){
				System.out.println("恭喜你们,你们可以结婚啦!");
			}else{
				System.out.println("对不起");
			}
			
		}else{
			System.out.println("对不起,你们的年龄不符合国家要求!");
		}
				
				
				
				
		
			
			
		}
	}
