package TestPkg;

public class Questions {
	
	//field
	 int points;
	 int difficulty;
	 int answerSpace;
	 String questionText;
	
	//constructor
	public Questions(int points, int difficulty, int answerSapce, String questionText) {
		this.points = points;
		this.difficulty = difficulty;
		this.answerSpace = answerSapce;
		this.questionText = questionText;
	}
	
	public int getPoints() {
		return points;
	}
	
	
	public int getDifficulty() {
		return difficulty;
	}
	
	
	public int getAnswerSpace() {
		return answerSpace;
	}
	
	
	public String toString() {
		return questionText;
	}
	
	public String getAnswerKeys() {
		return null;
	}
	
}
