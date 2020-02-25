
public class Person {
	
	String firstName;
	String lastName;
	int age;
	int ssn;
	
	//Address
	int streetNum;
	String streetName;
	String cityName;
	int zipCode;
	String state;
	
	public Person() {
		
	}
	
	public Person(String firstName, String lastName, int age, int ssn) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.ssn = ssn;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getSSN() {
		return ssn;
	}
	
	public void setSSN(int ssn) {
		this.ssn = ssn;
	}

	
	public void address(int streetNum, String streetName, String cityName, int zipCode, String state) {
		this.streetNum = streetNum;
		this.streetName = streetName;
		this.cityName = cityName;
		this.zipCode = zipCode;
		this.state = state;
	}
	
	public String getAddress() {
		return streetNum + " " + streetName + " " + cityName + " " + zipCode + " " + state;
	}
	
	
}
