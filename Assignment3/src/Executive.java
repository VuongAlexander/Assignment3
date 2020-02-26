
public class Executive extends Employee {
	float yearlyPay;
	float yearlyBonus;
	
	Executive(String firstName, String lastName, int age, int ssn, String levelOfEducation, int id, boolean specialAccomodations, float yearlyPay, float yearlyBonus, boolean directDeposit){
		super(firstName, lastName, age, ssn, specialAccomodations, id, levelOfEducation, specialAccomodations);
		this.yearlyPay = yearlyPay;
		this.yearlyBonus = yearlyBonus;
	}
	
	public float getYearlyPay(){
		return yearlyPay;
	}
	
	public void setYearlyPay(float yearlyPay){
		this.yearlyPay = yearlyPay;	
	}
	
	public String toString() {
		return "Executive [firstName= " + firstName + ", lastName= " + lastName + ", age= " + age + ", ssn= " + ssn + 
				", Address= " + streetNum + " " + streetName + " " + ", " + cityName + zipCode +", " + state + "]\n" + 	
				"[yearlyPay= " + yearlyPay + ", yearlyBonus = " + yearlyBonus + ", directDeposit= " + directDeposit + ", id= " + id + 
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
	
	public float computePay() {
		return yearlyPay = yearlyPay + yearlyBonus;
	}
}
