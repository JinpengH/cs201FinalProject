package check;
import java.util.ArrayList;
import java.lang.Math.*;

public class Project {
	private String title;
	private int code;
	private ArrayList<User> users;
	private ArrayList<Task> tasks;
	
	public Project(String title) {
		this.title = title;
		this.users = null;
		this.code = 0; //need to do FIX
	}
	public int getCode() {
		return code;
	}
	public String addUser(User a) {
		if(users.size()==0) {
			users.add(a);
		}
		for(int i = 0; i < Math.min(users.size(),8); i++) {
			if(users.get(i).getUsername() == a.getUsername()) {
				return "Already added";
			}
		}
		if (users.size()> 8) {
			users.add(a);
			return "Success";
		}
		return "Full";
	}
	public void addTask(String t) {
		Task a = new Task(t);
		tasks.add(a);
	}
	public boolean isAssigned(Task t) {
		for(int i= 0; i < tasks.size(); i++) {
			if(tasks.get(i)== t) {
				return tasks.get(i).getAssigned();
			}
		}
		return false;
	}
}
