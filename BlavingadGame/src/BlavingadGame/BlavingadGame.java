package BlavingadGame;
import java.util.Random;
import java.util.Scanner;

public class BlavingadGame {

	    // Named constants for moves
	    public static final int PLUFSIG = 0;
	    public static final int UPPSTA = 1;
	    public static final int GULLIGAST = 2;
	    public static final int SOLSKUR = 3;
	    public static final int DROMSLOTT = 4;


	    public static void main(String[] args) {
	        // Print the rules
	        System.out.println("Blavingad Game Rules:");
	        System.out.println("Dromslott beats Gulligast, Plufsig");
	        System.out.println("Gulligast beats Uppsta, Solskur");
	        System.out.println("Uppsta beats Dromslott, Plufsig");
	        System.out.println("Plufsig Beats Solskur, Gulligast");
	        System.out.println("Solskur beats Dromslott, Uppsta");
	        
	        playGame();
	    }
	    
	    // Ask the user whether he or she wants to play game
	    
	    public static void playGame() {
	    	boolean condition = true;
	    	Scanner in = new Scanner(System.in);
	        
	        int roundsPlayed = 0;
	        int userWins = 0;
	        
	        while (condition) {
	        	System.out.print("Do you want to play a round? (y/n): ");
	        	String userinput = in.nextLine();
            
	        	// Play rounds until the user chooses to quit
	        	if (userinput.equalsIgnoreCase("n")) {
	        		
	        		System.out.println();
	        		System.out.println("You've played "+ roundsPlayed + " rounds");
	        		System.out.println("You won " + userWins + " times");
	        		System.out.println("Comptuer won " + (roundsPlayed - userWins) + " tiems");
	        		
	        		condition = false;
            	
	        	} else {
	        		roundsPlayed ++;
	        		int user = userMove();
	        		int com = comMove();
	        		boolean winner = game(user, com);
	        		userWins = userWon(winner); 
            	
            	
	        	}
	        }
	    }
	    
	    public static int userMove() {
	    	
	    	Scanner in = new Scanner(System.in);
	    	System.out.println("Make your move: Plufsig 0, Uppsta 1, Gulligast 2, Solskur 3, Dromslott 4");
	    	
	    	int userMove = in.nextInt();
	    	
	    	while(userMove != 0 && userMove != 1 && userMove != 2 && userMove != 3 && userMove != 4) {
	    		System.out.println("Invalid movement");
	    		System.out.println("Make your move: Plufsig 0, Uppsta 1, Gulligast 2, Solskur 3, Dromslott 4");
	    		userMove = in.nextInt();
	    	}
	        System.out.println("Your move is " +convertMove(userMove));
	    	return userMove;
	    	
	    }
	    
	    public static int comMove() {
	    	Random rand = new Random(); 
	    	int computerMove = rand.nextInt(5);
	    	
	    	System.out.println("Comptuer's move is  " +convertMove(computerMove));
	    	return computerMove;
	    	
	    }
	    
	    public static String convertMove(int move) {
	    	
	    	if (move == 0) {
	    		return "Plufsig";
	    	} else if (move == 1) {
	    		return "Uppsta";
	    	} else if (move == 2) {
	    		return"Gulligast";
	    	} else if (move == 3) {
	    		return  "Solskur";
	    	} else if (move == 4) {
	    		return "Dromslott";
	    	}
			return null;
	    	
	    }
	    
	    public static boolean game(int user, int com ) {
	 
	    	if (user == PLUFSIG && (com == SOLSKUR || com == GULLIGAST)) {
	    			return true;
	    			
	    	} else if (user == UPPSTA && (com == DROMSLOTT || com == PLUFSIG)) {
	    		System.out.println("You won!");
	    		return true;
	    	} else if (user == GULLIGAST && (com == UPPSTA || com == SOLSKUR)) {
	    		System.out.println("You won!");
	    		return true;
	    	} else if(user == SOLSKUR && (com == DROMSLOTT || com == UPPSTA)) {
	    		System.out.println("You won!");
	    		return true;
	    	} else if (user ==DROMSLOTT && (com == GULLIGAST || com == PLUFSIG)) {
	    		System.out.println("You won!");
	    		return true;
	    	} else {
	    		System.out.println("Computer Won!");
	    		return false;
	    	}
	    }
	    
	    public static int userWon(boolean userwon) {
	    	int userWins = 0;
	    	if (userwon == true) {
	    		userWins ++;
	    	}
	    	
	    	return userWins;
	    }
}
	    	