package TestPkg;

import java.util.Arrays;

public class Test {
	private int totalPoints;
	private Questions[] questions;
	public Test(Questions[] questions) {
		this.questions = questions;
		
	}
	
	public String toString() {
		return Arrays.toString(questions);
	}
	
	public int getPoints() {
		for(int i = 0; i< questions.length;i++) {
			totalPoints += questions[i].points;
		}
		return totalPoints;
	}
	
	public String getAnswerKeys(){
		String answer = "";
		for(int i = 0; i<questions.length;i++) {
			answer += questions[i].getAnswerKeys() + " ";
		}
		return answer;
	}
}






