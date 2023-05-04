package Grades.java;
import java.util.Scanner;

public class Grades {
	/*
	 * Jihye Lee
	 * CIS 1068 Section 004
	 * Assignment 03
	 * This program accepts your homework and 
		two exam scores as input and computes your grade in the course.
	 */
	
	public static void main(String[] args) {
		System.out.println("This program accepts your homework and "
				+ "two exam scores as input and computes your grade in the course.");
		spacer();
		grade_calculator();
		
	}
	
	// Prints empty string to give a space
	public static void spacer() {
		System.out.println();
	}
	
	public static void grade_calculator() {
		Scanner weights = new Scanner(System.in);
		
		// Homework Weight
		System.out.print("Homework weight? ");
		int homework_w = weights.nextInt();
		spacer();
		
		// Exam 1 Weight
		System.out.print("Exam 1 weight? ");
		int exam1_w = weights.nextInt();
		spacer();
		
		//Exam 2 Weight
		int exam2_w = 100 - (homework_w + exam1_w);
		
		System.out.println("Using weights of " + homework_w + " "+ exam1_w + " "+exam2_w);
		
		// Calculate homework grade
		double hw_grade = homework(homework_w);
		
		// Calculate exam1 grade
		double exam1_grade = exam1(exam1_w);
		
		// Calculate exam2 grade
		double exam2_grade = exam2(exam2_w);
		
		// Print final grade
		double grade =  hw_grade + exam1_grade + exam2_grade;
		
		System.out.print("Course grade " + grade);
	}
	
	public static double homework(int homework_weight) {
		// Scanner
		Scanner homeworks = new Scanner(System.in);
		spacer();
		
		System.out.println("Homwork:");
		spacer();
		
		// Number of Homework
		System.out.print("Number of assignemnts? ");
		int num_hw = homeworks.nextInt();
		spacer();
		
		// Avg. HW grade
		System.out.print("Average Homework grade? ");
		double avg_hw = homeworks.nextDouble();
		
		if (avg_hw == 0.0 || avg_hw < 0){
			avg_hw = 0.0;	
		}
		else if(avg_hw > 10.0) {
			avg_hw = 10.0;
		}
		
		spacer();
		
		// Number of late days
		System.out.print("Number of late days used? ");
		int late_day = homeworks.nextInt();
		
		// 10% Deduction
		if (late_day > num_hw /2) {
			avg_hw = avg_hw - (avg_hw * 0.10);
		}
		// Earn Extra Credit
		else if (late_day == 0) {
			if (avg_hw < 10.0) {
				avg_hw += 5;
				if (avg_hw > 10.0) {
					avg_hw = 10.0;
				}
			}
			
		}
		spacer();
		
		// Number of labs attended
		System.out.print("Labs attended? ");
		int num_labs = homeworks.nextInt();
		spacer();
		
		// Calculate Unweighted Homework Grade
		double total_hw = avg_hw * num_hw + num_labs * 4;
		int total = num_hw * 10 + num_hw * 4;
		
		System.out.print("Total points =  " + total_hw + " / " + total);
		
		spacer();
		
		// Calculate weighted homework grade
		double weighted_hw_grade = (total_hw / total) * homework_weight;
		spacer();
		System.out.print("Weighted socre = " + weighted_hw_grade);
		spacer();
		
		return weighted_hw_grade;
		
	}
	
	public static double exam1(int exam1_weight) {
		spacer();
		// Call Scanner
		Scanner exam1 = new Scanner(System.in);
		
		System.out.print("Exam 1:");
		spacer();
		
		System.out.print("Score? ");
		double exam1_score = exam1.nextInt();
		
		// Check whether the user put correct exam score
		if (exam1_score < 0.0 || exam1_score == 0.0) {
			exam1_score = 0.0;
		}
		// check the maximum exam score(100)
		else if (exam1_score > 100.0) {
			exam1_score = 100.0;
		}
		spacer();
		
		System.out.print("Curve? ");
		int curve1 = exam1.nextInt();
		spacer();
		
		// Calculate the curve
		if (exam1_score + curve1 > 100) {
			exam1_score = 100;
		}
		else {
			exam1_score = exam1_score + curve1;
		}
		
		System.out.println("total points = " + exam1_score + "/" + 100 );
		
		// Calculate weighted exam 1 score
		double weighted_exam1_grade = exam1_weight * (exam1_score / 100);
		spacer();
		System.out.print("Weighted score " + weighted_exam1_grade);
		spacer();
		
		return weighted_exam1_grade;
	}
	
	
	public static double exam2(int exam2_weight) {
		//Call a scanner
		Scanner exam2 = new Scanner(System.in);
		spacer();
		
		System.out.print("Exam 2:");
		spacer();
		
		System.out.print("Score? ");
		int exam2_score = exam2.nextInt();
		
		//Check whether the user put correct exam score
		if (exam2_score < 0 || exam2_score == 0) {
			exam2_score = 0;
		}
		// check the maximum exam score(100)
		else if (exam2_score > 100) {
			exam2_score = 100;
		}
		
		spacer();
		// Calculate the curve
		System.out.print("Curve? ");
		int curve2 = exam2.nextInt();
		spacer();
		
		
		if (exam2_score + curve2 > 100) {
			exam2_score = 100;
		}
		else {
			exam2_score = exam2_score + curve2;
		}
		
		System.out.print("Total points = " + exam2_score + "/" + 100 );
		spacer();
		
		// Calculate weighted exam 2 score
		double weighted_exam2_grade = exam2_weight * (exam2_score / 100);
		spacer();
		System.out.print("Weighted score " + weighted_exam2_grade );
		
		return weighted_exam2_grade;
	}
	
	
}
	
	



