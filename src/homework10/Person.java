package homework10;

/**
 * 
 * 
 * 3.��дPerson�࣬���������������䣻
��д���乹�췽������Setter��Getter��������Ҫʹ��this�ؼ���
 *	Ҫ�����£�
 *	String  name;
 *	int  age; 
 *	boolean  gender 
 *	Person  partner��
 *  ΪPerson��дһ��marry(Person  p)����������ǰ�����p��飬�������Խ�飬�����������Ϣ��
 *  ����������ܽ��ԭ��Ҫ��������һ������дһ�������������������ϳ���
 * ������������ܽ�飺1��ͬ�ԣ�2��δ�ﵽ������䣬��<24��Ů<22��3��ĳһ���ѻ飩
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
	
	//���췽��
	public Person(String name,int age,boolean gender,String sex){
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.sex =sex;
	}
	
	//setting��getting
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
	
	//����
	public void marry(Person p){
		  
		if(partner.sex.equals(p.sex)){
			System.out.println("�Բ���,���ǲ��ܽ��!");
		}
		else if(partner.age>24 && p.age>22){
			if(sex.equals("��") == p.sex.equals("Ů")){
				System.out.println("��ϲ����,���ǿ��Խ����!");
			}else{
				System.out.println("�Բ���");
			}
			
		}else{
			System.out.println("�Բ���,���ǵ����䲻���Ϲ���Ҫ��!");
		}
				
				
				
				
		
			
			
		}
	}
