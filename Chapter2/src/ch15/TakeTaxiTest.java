package ch15;

public class TakeTaxiTest {

	public static void main(String[] args) {

		Person personK = new Person("Jjun Baam", 20000);
		Taxi taxiJW = new Taxi("�� ���� ���");
		
		personK.takeTaxi(taxiJW);
		
		personK.showInfo();
		taxiJW.showTaxiInfo();
	}

}