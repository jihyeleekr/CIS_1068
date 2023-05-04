package TestPkg;

public class MultipleChoiceQuestion extends ObjectiveQuestion {
	String [] possibleAns;
	
	public MultipleChoiceQuestion(int points, int difficulty, int answerSapce, String questionText,
			String correctAnswer, String[] possibleAns) {
		super(points, difficulty, answerSapce, questionText, correctAnswer);
		this.possibleAns = possibleAns;
	}
	public String generateQuestionString() {
        return questionText + "\n" + generatePossibleAnswers() ;
    }
	
	public String generatePossibleAnswers() {
		String answers = "";
		for (int i = 0; i< possibleAns.length;i++) {
			for (int j = 1; j>i; j++) {
				answers += j+"." + possibleAns[i] + "\n";
			}
		}
		return answers;
		
	}

    // Method to generate answer key string
    public String generateAnswerKeyString() {
    	for(int i = 0; i < possibleAns.length; i++) {
    		if (correctAnswer == possibleAns[i]) {
    			possibleAns[i] = "****" + correctAnswer + "****";
    		}
    	}
        return questionText + "\n" + generatePossibleAnswers();
    }

}
