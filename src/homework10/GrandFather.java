package homework10;


/**
 * 
 * 1������GrandFather�࣬���а���
	a)���ԣ�������name�������䣨age��
	b)����getGrandFather()����ʾүү����Ϣ
	c)���췽������үү�����������丳ֵ

	2������Father�࣬�̳�Grandfather��
	a)���ԣ����˼̳�үү���������⣬��Ҫ�����Լ������ԣ���ְҵ��(occupation)
	b)���췽������ʽ���ø���Ĺ��췽����ΪFather������������丳��ʼֵ����Ϊְҵ�����ʼֵ��
	c)����getFather(): ��ʾ���׵������Ϣ

	3������ClassMain�࣬����main()����������GrandFather��Ķ����Father��Ķ��󣬲��ֱ���ʾ��ϸ��Ϣ

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
	

	//���췽��(�в�)
	public GrandFather(String name,int age) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
		
	}
	
	public void getGrandFather(){

		System.out.println("����:"+getName());
		System.out.println("����:"+getAge());
		System.out.println("------------------------");
	}
	
	public GrandFather(){}
	
	
	
}
