package Fractionpkg;

public class FractionMain {
	public static void main(String []args) {
		// Make two new fraction
		Fraction a = new Fraction(1,2);
		Fraction b = new Fraction(2,4);
		
		// Get numerator of each fractions
		System.out.println(a.getNum()); //EXP: 1
		System.out.println(b.getNum()); //EXP: 2
		
		//Get Denominator of each fractions
		System.out.println(a.getDenom()); //EXP: 2
		System.out.println(b.getDenom()); //EXP: 4
		
		//Add fraction a and b
		System.out.println(a.add(b)); //EXP: 1/1
		
		//Check whether two fractions a and b are equal
		System.out.println(a.equals(b)); //EXP: true
		
		//Set fraction a's numerator into 4
		a.setNum(4);
		
		//set fraction b's denominator into 1
		b.setDenom(1);
		
		//Print fraction a and b
		System.out.println(a.toString()); //EXP:4/2
		System.out.println(b.toString()); //EXP: 2/1
		
	}
}
