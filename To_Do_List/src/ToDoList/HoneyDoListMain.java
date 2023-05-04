package ToDoList;

import java.time.LocalDateTime;

public class HoneyDoListMain {
	public static void main(String []args) {
	//Create a new task
	HoneyDoList honeydo = new HoneyDoList();
	// return honey do list
	System.out.println(honeydo); //exp: empty
	// Add a task
	honeydo.addTask(new Task("take aspirin", 1, LocalDateTime.of(2021, 10,1,3,9), 5));
	honeydo.addTask(new Task("submit the lab", 2, LocalDateTime.of(2023, 4, 17,23, 0), 120));
	System.out.println(honeydo.getTask(0)); //exp: return 'take aspirin' task
	System.out.println(honeydo.getTask(1)); //exp: return 'submit the lab' task with due date and time.
	
	//return the index of the task
	System.out.println(honeydo.find("take aspirin")); //exp: 0
	System.out.println(honeydo.find("submit the lab")); //exp: 1
	
	//toString
	System.out.println(honeydo.toString()); //return all the tasks
	
	//Overdue homeworks
	System.out.println(honeydo.getOverdueTasks()); //return 'take aspirin' task only
	
	//return total time
	System.out.println(honeydo.totalTime());//exp: 125
	
	//return the index of the task which takes the shortest time
	System.out.println(honeydo.shortestTime()); // exp: return 0 for the index of 'take aspirin' task
	
	//remove a tasks that is finished
	System.out.println(honeydo.completeTask(0));
	System.out.println(honeydo.find("submit the lab")); //exp: 0 
	}

}
