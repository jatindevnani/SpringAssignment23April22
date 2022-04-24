package beanQuestion;

public class Adventure {
	private Person man;
	private Person woman;
	private Person man2;
	
	public void setup() {
		System.out.println("The adventure class has been initialised..! Call start method to start the adventure..!");
	}
	
	public Adventure() {}
	
	public void setMan(Person man) {
		this.man = man;
	}
	
	public void setWoman(Person woman) {
		this.woman = woman;
	}
	
	public void setMan2(Person man2) {
		this.man2 = man2;
	}
	
	public void start() {
		System.out.println("Lets start the adventure...!");
		man.walk();
		woman.walk();
		
		System.out.println();
		man2.walk();
		System.out.println(" ...again");
		
		System.out.println(man == man2);
		
	}
	
	public void endJourney() {
		System.out.println("Ending the journey here! It was great!!!");
	}
}
