package domain;

public class Animal implements AnimalInterface{
	private String vrsta;

	public Animal(String vrsta) {
		super();
		this.vrsta = vrsta;
	}

	public String getVrsta() {
		return vrsta;
	}

	@Override
	public void info() {
		System.out.println("This animal is "+vrsta);
		
	}
	
	
}
