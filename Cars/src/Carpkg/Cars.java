package Carpkg;
public class Cars {
	// fields
		String make;
		String model;
		int year;
		double mpg;
		double milesDriven;
		double fuelCapacity;
		double fuelRemaining;
	
	// Constructor
	Cars (String make, String model, int year, double mpg, double milesDriven, double fuelCapacity, double fuelRemaining){
		
		this.make = make;
		this.model = model;
		this.year = year;
		this.mpg = mpg;
		this.milesDriven = milesDriven;
		this.fuelCapacity = fuelCapacity;
		this.fuelRemaining = fuelRemaining;
	}
	
	// method
	public String toString() {
		return this.make + this.model;
	}
	
	public void fillTank(double g) {
		if (this.fuelRemaining + g < this.fuelCapacity){
			this.fuelRemaining = this.fuelRemaining +g;
		} else {
			double available = 0;
			available = this.fuelCapacity - this.fuelRemaining;
			this.fuelRemaining += available;
		}
	}
	//which simulates driving m miles in the car, adding to the total number of miles driven, 
	//and reducing the amount of gas in the car according to this car's average MPG.
	public void drive(double m) {
		this.milesDriven += m;
		this.fuelRemaining -= m * (1/this.mpg);
		
	}
	
	public double getFuelRemaining( ) {
		return this.fuelRemaining;
	}
	
	
	

}
