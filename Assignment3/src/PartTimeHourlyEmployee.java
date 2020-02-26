
public class PartTimeHourlyEmployee extends Employee{
	private float hourlyPay;
	
	PartTimeHourlyEmployee(String firstName, String lastName, int age, int ssn, String levelOfEducation, int id, boolean specialAccomodations, float hourlyPay, boolean directDeposit){
		super(firstName, lastName, age, ssn, specialAccomodations, id, levelOfEducation, specialAccomodations);
		this.hourlyPay = hourlyPay;
	}
	
	public float getHourlyPay(){
		return hourlyPay;
	}
	
	public void setHourlpyPay(float hourlyPay){
		this.hourlyPay = hourlyPay;	
	}
	
	
	
	@Override
	public String toString() {
		return "PartTimeHourlyEmployee [firstName= " + firstName + ", lastName= " + lastName + ", age= " + age + ", ssn= " + ssn + 
				", Address= " + streetNum + " " + streetName + " " + zipCode + ", " + cityName + ", " + state + "]\n" + 	
				"[hourlyPay= " + hourlyPay + ", directDeposit= " + directDeposit + ", id= " + id + 
				", specialAccomodations= " + specialAccomodations + ", levelOfEducation= " + levelOfEducation + "]";
	}

	public void introduce() {
		System.out.println(toString());
	}
	
	//Remove SSN
	public String introduce(boolean removeSSN) {
		return "Executive [firstName= " + firstName + ", lastName= " + lastName + ", age= " + age + 
		", Address= " + streetNum + " " + streetName + " " + ", " + cityName + zipCode +", " + state + "]\n";
	}
			
	//Remove SSN and paymentINfo
	public String introduce(int oneOrZero) {
		return "Executive [firstName= " + firstName + ", lastName= " + lastName + ", age= " + age + 
		", Address= " + streetNum + " " + streetName + " " + ", " + cityName + zipCode +", " + state + "]\n";
	}
	
	public float computePay(float hours) {
		if(hours > 40) {
			return hourlyPay = -1;
		}
		return hourlyPay * hours;
		
	}
}
