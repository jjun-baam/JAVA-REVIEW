package ch15;

public class TakeTaxiTest {

	public static void main(String[] args) {

		Person personK = new Person("Jjun Baam", 20000);
		Taxi taxiJW = new Taxi("잘 간다 운수");
		
		personK.takeTaxi(taxiJW);
		
		personK.showInfo();
		taxiJW.showTaxiInfo();
	}

}
