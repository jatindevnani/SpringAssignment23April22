package beanQuestion;

public class Woman implements Person{
	
	private String name;
	
	public Woman (String woman) {
		this.name = woman;
	}
	
	public void walk() {
		System.out.println( this.name + " is walking...");
	}
	
}
