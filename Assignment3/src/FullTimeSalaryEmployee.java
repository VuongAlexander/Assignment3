
public class FullTimeSalaryEmployee extends Employee{

	float yearlyPay;

	FullTimeSalaryEmployee(String firstName, String lastName, int age, int ssn, String levelOfEducation, int id, boolean specialAccomodations, float yearlyPay, boolean directDeposit){
		super(firstName, lastName, age, ssn, specialAccomodations, id, levelOfEducation, specialAccomodations);
		this.yearlyPay = yearlyPay;
	}
	
	public float getYearlyPay(){
		return yearlyPay;
	}
	
	public void setYearlyPay(float yearlyPay){
		this.yearlyPay = yearlyPay;	
	}
	
	@Override
	public String toString() {
		return "FullTimeSalaryEmployee [firstName= " + firstName + ", lastName= " + lastName + ", age= " + age + ", ssn= " + ssn + 
				", Address= " + streetNum + " " + streetName + " " + zipCode + ", " + cityName + ", " + state + "]\n" + 	
				"[yearlyPay= " + yearlyPay + ", directDeposit= " + directDeposit + ", id= " + id + 
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
	
	public float computePay(float numberOfWeeks) {
		float pay = 0; 
		float payPerWeek = (float) (getYearlyPay()/52.1429);
		pay = numberOfWeeks * payPerWeek;
		return pay;
	}
}
