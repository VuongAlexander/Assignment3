
public class BusinessTest {
	
	public static void main(String args[]) {
		Customer c = new Customer("Alex", "Vuong", 20, 666557777, "Debit");
		c.address(690, "Milky Way", "San Jose", 95056, "CA");
		c.makePayment();
		c.introduce();
		System.out.println();
		
		Customer c1 = new Customer("Kevin", "Nguyen", 20, 557776666, "Cash");
		c1.address(690, "No Way", "Sacramento", 83211, "CA");
		c1.makePayment();
		c1.introduce();
		System.out.println();
		
		Contractor cc = new Contractor("Alan", "Thoi", 23, 123456789, "Bachelors", 772, false, 200000, 3000, true);
		cc.address(5555, "Nor Way", "San Jose", 95111, "CA");
		cc.introduce();
		System.out.println("OverTime Pay: " + cc.computePay(44));
		System.out.println();

		Contractor cc1 = new Contractor("Calvin", "Nguyen", 23, 679990000, "pHD", 774, false, 542322, 4231, false);
		cc1.address(1623, "BS Lane", "San Francisco", 53342, "CA");
		cc1.introduce();
		System.out.println("Regular Pay: " + cc1.computePay(20));
		System.out.println();
		
		FullTimeHourlyEmployee hE = new FullTimeHourlyEmployee("Steven", "Vuong", 25, 0, "Masters", 125, true, 51, 0, false);
		hE.address(8854, "BS Lane", "San Francisco", 66644, "CA");
		hE.introduce();
		System.out.println("Regular Pay: " + hE.computePay(20));
		System.out.println();
		
		FullTimeHourlyEmployee hE1 = new FullTimeHourlyEmployee("Tracey", "Chung", 25, 784442289, "Masters", 883, true, 49, 0, false);
		hE1.address(457, "Yes Way", "Milpitas", 55442, "CA");
		hE1.introduce();
		System.out.println("OverTime Pay: " + hE1.computePay(44));
		System.out.println();
		
		Executive e = new Executive("Steve", "Jobs", 54, 112227777, "pHD", 777, false, 11200378, 1000, false);
		e.address(221, "iPhone Street", "Apple", 22392, "NY");
		e.introduce();
		System.out.println("Yearly Salary : " + e.computePay());
		System.out.println();
		
		Executive e1 = new Executive("Bill", "Gates", 54, 446667777, "pHD", 779, false, 23200378, 4400, false);
		e1.address(221, "Microsoft Way", "Windows", 22392, "NJ");
		e1.introduce();
		System.out.println("Yearly Salary : " + e1.computePay());
		System.out.println();
		
		FullTimeSalaryEmployee sE = new FullTimeSalaryEmployee("Tina", "Truong", 20, 889990000, "Masters", 109, false, 128000, true);
		sE.address(444, "Jay Road", "Los Angeles", 77833, "CA");
		sE.introduce();
		System.out.println("Yearly Salary: " + sE.computePay(52));
		System.out.println();

		FullTimeSalaryEmployee sE1 = new FullTimeSalaryEmployee("Tyler" , "Creator", 45, 778883333, "pHD", 244, false, 256000, true);
		sE1.address(444, "Beyonce Way", "Los Angeles", 77833, "CA");
		sE1.introduce();
		System.out.println("Yearly Salary: " + sE1.computePay(52));
		System.out.println();
		
		PartTimeHourlyEmployee pTE = new PartTimeHourlyEmployee("Jeff", "Ly", 21, 445556666, "College", 123, false, 20, true);
		pTE.address(456, "Angle Court", "Cupertino", 11442, "CA");
		pTE.introduce();
		System.out.println("Over Time Salary failed: " + pTE.computePay(41));
		System.out.println();
				
		PartTimeHourlyEmployee pTE1 = new PartTimeHourlyEmployee("Bryan", "Do", 21, 112223333, "College", 456, true, 40, false);
		pTE1.address(456, "Yes Way", "Milpitas", 55442, "CA");
		pTE1.introduce();
		System.out.println("Regular Salary: " + pTE1.computePay(10));
		System.out.println();
	}
	
}
