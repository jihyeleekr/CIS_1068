package ToDoList;


import java.time.LocalDateTime;

public class TaskMain {
	public static void main(String []args) {
		//create a new task
		Task postHW = new Task("post 1068 homework", 1, LocalDateTime.of(2019, 3, 23, 13, 0), 180);
		Task doHW = new Task("finish 1068 lab assignment", 2, LocalDateTime.of(2023, 4, 10, 23,59), 60);
		
		//get task name
		System.out.println(postHW.getName()); //exp: 'post 1068 homework'
		System.out.println(doHW.getName()); //exp: 'finish 1068 lab assignment'
		
		//get priority
		System.out.println(postHW.getPrio()); //exp: 1
		System.out.println(doHW.getPrio()); //exp: 2
		
		//get whendue
		System.out.println(postHW.getWhenDue()); //exp: 2019,3,23 1:00 PM
		System.out.println(doHW.getWhenDue()); //exp: 2023,4,10,11:59 PM
		
		//set task name
		postHW.setName("finish 1068 lab assignment"); //exp: 'post 1068 homework'
		doHW.setName("post 1068 homework"); //exp: 'finish 1068 lab assignment'
		
		//set ECT
		postHW.setEtc(60);
		doHW.setEtc(5);
		
		//set due
		postHW.setWhenDue(LocalDateTime.of(2023, 4, 7, 23,59));
		doHW.setWhenDue(LocalDateTime.of(2023, 4, 10, 23,59));
		
		//toString()
		System.out.println(postHW.toString());
		System.out.println(doHW.toString());
		
		//Increase priority
		System.out.println(doHW.increasePriority(2));
		
		//Decrease priority
		System.out.println(postHW.decreasePriority(4));
		
		//overdue
		System.out.println(postHW.overdue());
		System.out.println(doHW.overdue());
	}
}
