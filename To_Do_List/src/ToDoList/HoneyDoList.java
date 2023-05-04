package ToDoList;

import java.time.LocalDateTime;
import java.util.Arrays;

public class HoneyDoList {
	//fields
	private Task[] tasks;
	private int numTasks;
	private int INITIAL_CAPACITY;
	
	//constructor
	public HoneyDoList() {
        tasks = new Task[INITIAL_CAPACITY];
        numTasks = 0;
    }
	
	//toString()
	public String toString() {
        String task = "Honey Do List: ";
        if (numTasks == 0) {
            return task + "empty";
        } else {
            for (int i = 0; i < numTasks; i++) {
                if (tasks[i] != null) {
                    task +=(tasks[i].toString());
                    if (i < numTasks - 1) {
                        task += ", ";
                    }
                }
            }
        }
        return task;
	}
	
	//find a task index
	public int find(String name) {
		for (int i = 0; i < numTasks; i++) {
            if (tasks[i].getName().equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
	}
	
	//add a new task 
	public void addTask(Task task) {
	    if (numTasks == tasks.length) {
	        // Resize tasks array if it's full
	        Task[] newTasks = new Task[tasks.length +1];
	        System.arraycopy(tasks, 0, newTasks, 0, tasks.length);
	        System.out.println("Honey Do List: ");
	        System.out.print("    ");
	        tasks = newTasks;
	    }
	    tasks[numTasks] = task;
	    numTasks++;
	}
	// return the name of the task
	public Task getTask(int index) {
		if (index >= 0 && index < numTasks) {
            return tasks[index];
        }
        return null;
	}
	// return overdue tasks
	public HoneyDoList getOverdueTasks() {
        HoneyDoList overdueTasks = new HoneyDoList();
        LocalDateTime currentDateTime = LocalDateTime.now();
        for (int i = 0; i < numTasks; i++) {
            if (tasks[i].overdue()) {
                overdueTasks.addTask(tasks[i]);
            }
        }
        return overdueTasks;
    }
	
	//return total time
	public int totalTime() {
		int total_time = 0;
		for(int i = 0; i < numTasks; i++) {
			total_time += tasks[i].getEtc();
		}
		return total_time;
	} 
	
	// ShortetTime()
	public int shortestTime() {
		int index = -1;
		int short_time = 100000;
		for(int i = 0; i < numTasks; i++) {
			if (short_time > tasks[i].getEtc()) {
				short_time = tasks[i].getEtc();
				index = i;
			}
		}
		return index;
	}
	// completeTask()
	public Task completeTask(int index) {
		Task completedTask = tasks[index];
		if (index < numTasks) {

	        for (int i = index; i < numTasks - 1; i++) {
	            tasks[i] = tasks[i + 1];
	        }

	        tasks[numTasks - 1] = null;
	        numTasks--;

	        return completedTask;
		}
		return null;
	}

}
