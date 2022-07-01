package accessModifier;

public class Car {
	

	public String name;
	private int price;//private
	protected int licNumber;
	String color;// default 
	
	
//same class
	public static void main(String[] args) {



		Car c = new Car();
		c.price = 100;
		c.name= "honda";
		c.licNumber= 982;
		c.color="blue";
		
	}

}
