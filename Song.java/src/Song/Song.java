package Song;

public class Song {
	/*
	 * Jihye Lee
	 * CIS 1068 Section 004
	 * Assignment 02
	 * This program prints the lyrics of the song "Bought Me a Cat"
	 */
	public static void main(String[] args) {
		// Verse 1
		cat_intro();
		verse1();
		// Verse 2
		hen_intro();
		verse2();
		// Verse 3
		duck_intro();
		verse3();
		// Verse 4
		goose_intro();
		verse4();
		// Verse 5
		sheep_intro();
		verse5();
		// Verse 6
		pig_intro();
		verse6();
		
	}
	//verse 1
	public static void cat_intro() {
		System.out.println("Bought me a cat and the cat pleased me,");
		System.out.println("I fed my cat under yonder tree.");
	}
	public static void verse1() {
		System.out.println("Cat goes fiddle-i-fee.");
		System.out.println(" ");
	}
	// verse 2
	public static void hen_intro() {
		System.out.println("Bought me a hen and the duck pleased me,");
		System.out.println("I fed my hen under yonder tree.");
	}
	public static void verse2() {
		System.out.println("Hen goes chimmy-chuck, chimmy-chuck,");
		verse1();
	}
	// verse 3
	public static void duck_intro() {
		System.out.println("Bought me a duck and the duck pleased me,");
		System.out.println("I fed my duck under yonder tree.");
	}
	public static void verse3() {
		System.out.println("Duck goes quack, quack,");
		verse2();
	}
	// verse 4
	public static void goose_intro() {
		System.out.println("Bought me a gooes and the gooes pleased me,");
		System.out.println("I fed my gooes under yonder tree.");
	}
	public static void verse4() {
		System.out.println("Goose goes hissy, hissy,");
		verse3();
	}
	
	// verse 5
	public static void sheep_intro() {
		System.out.println("Bought me a sheep and the sheep pleased me,");
		System.out.println("I fed my sheep under yonder tree.");
	}
	
	public static void verse5() {
		System.out.println("Sheep goes baa, baa,");
		verse4();
	}
	// verse 6
	public static void pig_intro() {
		System.out.println("Bought me a pig and the pig pleased me,");
		System.out.println("I fed my pig under yonder tree.");	
	}
	
	public static void verse6() {
		System.out.println("Pig goes oink, oink,");
		verse5();
	}
}