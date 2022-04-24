package beanQuestion;

public class Man implements Person{
	
	private String name;

	
	public Man(String name) {
		this.name = name;
	}
	
	public void walk() {
		System.out.println(this.name + " is walking...");
	}

}
