package ToDoList;
import java.time.LocalDateTime;


public class Task {
	
	//field
	private String name;
	private int priority;
	private int esMinsToComplete;
	private LocalDateTime whenDue;
	
	//constructor
	Task(String name, int priority, LocalDateTime whenDue, int esMinsToComplete) {
		
		this.name = name;
		this.priority = priority;
		this.esMinsToComplete = esMinsToComplete;	
		this.whenDue = whenDue;
		
	}
	//accessor
	
	public String getName() {
		return name;
	}
	
	public int getPrio() {
		return priority;
	}
	
	public int getEtc() {
		return esMinsToComplete;
	}
	
	public LocalDateTime getWhenDue() {
        return whenDue;
    }
	
	//mutator
	
	public void setName(String n) {
		name = n;
	}
	
	public void setEtc(int etc) {
		esMinsToComplete = etc;
	}
	
	 public void setWhenDue(LocalDateTime whenDue) {
	        this.whenDue = whenDue;
	    }
	
	//toString()
	public String toString() {
		return "which would be to remind me to " + name 
				+". This has priority " + priority +", should take me "
				+ esMinsToComplete + " minutes" + " and it's due " + whenDue;
	}
	
	//increase Prio
	public int increasePriority(int amount) {
		if(amount < 0){
			return priority;
		} else {
			return priority += amount;
		}
	}
	
	//decrease Prio
	public int decreasePriority(int amount) {
		if((amount - priority) > 0){
			return priority = 0;
		} else {
			return priority -= amount;
		}
	}
	
	//overdue() returns true if the current date/time is later than whenDue or false otherwise.
	public boolean overdue() {
		LocalDateTime now = LocalDateTime.now();
        return now.isAfter(whenDue);
	}
}
