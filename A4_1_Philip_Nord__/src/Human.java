
public class Human {
	
	private Dog dog;
	private String name;

	


	public Human (String name){
		
		this.name = name;
	
	}
	
	public String getName(){
		
		return this.name;
		
	}
	

	public Dog buyDog(Dog dog){
		
		return this.dog = dog;
		
	}
	
	public String getInfo(){
		String allInfo = "";
		
		allInfo += getName() + " owns a dog named " + dog.getOwnerName();
		return allInfo;
		
	}

}
