
public class Customer extends Person{
	String paymentMethod; //Relevent to Customers only
	
	public Customer() {
		
	}
	
	public Customer(String firstName, String lastName, int age, int ssn, String paymentMethod) {
		super(firstName, lastName, age, ssn);
		this.paymentMethod = paymentMethod;
	}

	@Override
	public String toString() {
		return "Customer [firstName= " + firstName + ", lastName= " + lastName + ", Age = " + age + ", SSN = " + ssn +  
				", Address= " + streetNum + " " + streetName + ", " + cityName + " " + zipCode + ", " + state + "]\n" 
				+ "Payment Method = " + paymentMethod;
	}
	
	public void introduce() {
		System.out.println(toString());
	}
	
	//Remove SSN
	public String introduce1() {
		return "Executive [firstName= " + firstName + ", lastName= " + lastName + ", age= " + age + 
		", Address= " + streetNum + " " + streetName + " " + ", " + cityName + zipCode +", " + state + "]\n";
	}
			
	//Remove SSN and paymentINfo
	public String introduce2() {
		return "Executive [firstName= " + firstName + ", lastName= " + lastName + ", age= " + age + 
		", Address= " + streetNum + " " + streetName + " " + ", " + cityName + zipCode +", " + state + "]\n";
	}
	
	public String makePayment() {
		return paymentMethod;
	}
	
}
