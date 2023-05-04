package Fractionpkg;

public class Fraction {
	//fields
	
	int numerator;
	int denominator;
	
	//constructor
	
	public Fraction(int n, int d) {
		if (d == 0) {
			throw new ArithmeticException();
		} else {
			numerator = n;
			denominator = d;
		}
	}
	
	//method
	
	public int getNum() {
		return numerator;
	}
	
	public int getDenom() {
		return denominator;
	}
	
	public void setNum(int n) {
		numerator = n;
	}
	public void setDenom(int d) {
		if (d == 0) {
			throw new ArithmeticException();
		} else {
			denominator = d;
		}
		
	}
	public Fraction add(Fraction a) {
		int numer = this.numerator * a.denominator + this.denominator * a.numerator;
		int deno = this.denominator * a.denominator;
		if (deno == numer ) {
			numer = 1;
			deno = numer;
		}else if(deno % numer == 0) {
			if(deno < numer) {
				numer = numer / deno;
				deno = deno / deno;
			} else {
				numer = numer / numer;
				deno = deno / numer;
			}
		} else {
			while(deno % 2 == 0  && numer % 2 == 0) {
				deno = deno /2;
				numer = numer / 2;
			}
		}
		Fraction frac = new Fraction(numer, deno);
		
		return frac;
	}
	/*
	 *  a/b c/d if a*d and b*c are equal or since the fractions are normalized, if a==c and b==d.
	 */
	public boolean equals(Fraction a) {
		int numer = this.numerator * a.denominator;
		int deno = this.denominator * a.numerator;
		while(deno % 2 == 0 && numer % 2 == 0) {
			deno = deno /2;
			numer = numer /2;
		}
		
		if (deno % numer == 0) {
			if(deno < numer) {
				numer = numer / deno;
				deno = deno / deno;
			} else {
				numer = numer / numer;
				deno = deno / numer;
			}
		}
		if(deno == numer) {
			return true;
		} else {
			return false;
		}
	}
	public String toString() {
		return numerator + "/" + denominator;
	}
	
	

}
