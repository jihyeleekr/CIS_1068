package TestPkg;

public class FillInTheBlankQuestion extends ObjectiveQuestion {

	public FillInTheBlankQuestion(int points, int difficulty, int answerSapce, String questionText,
			String correctAnswer) {
		super(points, difficulty, answerSapce, questionText, correctAnswer);
	}
	
	public String generateQuestionString() {
        return questionText;
    }

    // Method to generate answer key string
    public String generateAnswerKeyString() {
    	String answerKey = "";
    	int count = 0;
    	int start = 0;
    	int end = 0;
    	for (int i = 0; i<questionText.length();i++) {
    		if ("_".equals(questionText.charAt(i))) {
    			count += 1;
    		}
    	}
    	start = questionText.indexOf("_", 1);
    	end = questionText.indexOf("_", count);
    	
    	for (int i = 0; i <questionText.length(); i++){
    		if (i == start) {
    			answerKey += "__" + correctAnswer + "__";
    			i = end;
    		}else {
    			answerKey += questionText.charAt(i);
    		}
    	}
        return answerKey;
    }

}
