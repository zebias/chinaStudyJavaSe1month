package homework10;

public class Father extends GrandFather{
	
	private String occupation;
	
	public void setOccupation(String occupation){
		this.occupation = occupation;
	}
	
	public String getOccupation(){
		return occupation;
	}

	
	
	
	public Father(String name, int age,String occupation) {
		super(name, age);
		// TODO Auto-generated constructor stub

		this.occupation = occupation;
		
		
		
		}

			public void getFather(){
				System.out.println("����:"+getName());
				System.out.println("����:"+getAge());
				System.out.println("ְҵ:"+getOccupation());
			}
			
			public Father(){}
	}
	
	

