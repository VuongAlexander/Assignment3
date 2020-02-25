
public class Employee extends Person{
	boolean directDeposit;
	int id;
	boolean specialAccomodations;
	String levelOfEducation;
	
	public Employee() {
		
	}
	
	public Employee(String firstName, String lastName, int age, int ssn, boolean specialAccomodations, int id, String levelOfEducation, boolean directDeposit) {
		super(firstName, lastName, age, ssn);
		this.directDeposit = directDeposit;
		this.id = id;
		this.specialAccomodations = specialAccomodations;
		this.levelOfEducation = levelOfEducation;
	}
	
	public boolean getDirectDeposit() {
		return directDeposit;
	}

	public void setDirectDeposit(boolean directDeposit) {
		this.directDeposit = directDeposit;
	}

	public int getID() {
		return id;
	}

	public void setID(int id) {
		this.id = id;
	}
	
	public boolean getSpecialAccomodations() {
		return specialAccomodations;
	}

	public void setSpecialAccomodations(boolean specialAccomodations) {
		this.specialAccomodations = specialAccomodations;
	}

	public String getLevelOfEducation() {
		return levelOfEducation;
	}

	public void setLevelOfEducation(String levelOfEducation) {
		this.levelOfEducation = levelOfEducation;
	}
}
