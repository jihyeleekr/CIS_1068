package TestPkg;

public class Test_Gnerator {
	public static void main(String[] args) {
		Questions q[] = new Questions[4];
		
		FillInTheBlankQuestion fb1 = new FillInTheBlankQuestion(2, 4, 3, "______ was the 16th US President.", "Abraham Lincoln");
        FillInTheBlankQuestion fb2 = new FillInTheBlankQuestion(2, 5, 2, "_____ is the capital of France.", "Paris");
        
        q[0] = fb1;
        q[1] = fb2;
        
        String pans[] = {"Peter Griffin","Scooby Doo","Spongebob Squarepants","Eric Cartman"};
       
        MultipleChoiceQuestion mc1 = new MultipleChoiceQuestion(3, 6, 1, "Who lives in a pineapple under the sea?", "Spongebob Squarepants", pans);

        String pans2[] = {"Apple","Banana","Cherry","Durian"};
 
        MultipleChoiceQuestion mc2 = new MultipleChoiceQuestion(3, 7, 3, "Which fruit is red?", "Cherry",pans2);

        q[2] = mc1;
        q[3] = mc2;
       
        Test test = new Test(q);
        
        System.out.println("TEST:");
        System.out.println(test.toString());

        // Print the answer key
        System.out.println("\n\nANSWER KEY:");
        System.out.println(test.getAnswerKeys());
        
        
        
	}

}
