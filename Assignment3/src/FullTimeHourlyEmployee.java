
public class FullTimeHourlyEmployee extends Employee{
	float hourlyPay;
	float overTimePay;
	
	FullTimeHourlyEmployee(String firstName, String lastName, int age, int ssn, String levelOfEducation, int id, boolean specialAccomodations, float hourlyPay, float overTimePay, boolean directDeposit){
		super(firstName, lastName, age, ssn, specialAccomodations, id, levelOfEducation, specialAccomodations);
		this.hourlyPay = hourlyPay;
		this.overTimePay = overTimePay;
	}
	
	public float getHourlyPay(){
		return hourlyPay;
	}
	
	public void setHourlyPay(float hourlyPay){
		this.hourlyPay = hourlyPay;	
	}
	
	public float getoverTimePay(){
		return overTimePay;
	}
	
	public void setOverTimePay(float overTimePay){
		this.overTimePay = overTimePay;	
	}
	
	@Override
	public String toString() {
		return "FullTimeHourlyEmployee [firstName= " + firstName + ", lastName= " + lastName + ", age= " + age + ", ssn= " + ssn + 
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
			overTimePay = (float) (hourlyPay * hours * 1.5);
			return overTimePay;
		}
		else {
			return hourlyPay * hours;
		}
	}
}
