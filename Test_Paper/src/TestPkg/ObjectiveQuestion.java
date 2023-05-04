package TestPkg;

public class ObjectiveQuestion extends Questions {
	
	String correctAnswer;

	public ObjectiveQuestion(int points, int difficulty, int answerSapce, String questionText, String correctAnswer) {
		super(points, difficulty, answerSapce, questionText);
		this.correctAnswer = correctAnswer;
		
		// 
	}
	
	public String getAnswerKeys() {
		return correctAnswer;
	}

}
