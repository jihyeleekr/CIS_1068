package Carpkg;

public class CarsMain {
	public static void main(String[] args) {
		Cars pinto = new Cars("Ford", "Pinto", 1972, 17.5, 132480, 12, 8);
		Cars sonata = new Cars("Hyundai","Sonata", 2023, 23, 4324, 20, 4);
		Cars sonet = new Cars("Kia", " Sonet", 2020, 20, 134253, 15, 5);
		//Test for pinto
		System.out.println(pinto.toString());	
		pinto.fillTank(10);
		System.out.println(pinto.getFuelRemaining( ));
		
		pinto.drive(5);
		System.out.println(pinto.milesDriven);
		System.out.println(pinto.getFuelRemaining( ));
		
		// Test for sonata
		System.out.println();
		System.out.println(sonata.toString());	
		sonata.fillTank(1);
		System.out.println(sonata.getFuelRemaining( ));
		
		sonata.drive(5);
		System.out.println(sonata.milesDriven);
		System.out.println(sonata.getFuelRemaining( ));
		
		//Test for sonet
		System.out.println();
		System.out.println(sonet.toString());	
		sonet.fillTank(1);
		System.out.println(sonet.getFuelRemaining( ));
		
		sonet.drive(5);
		System.out.println(sonet.milesDriven);
		System.out.println(sonet.getFuelRemaining( ));
		
	}

}
