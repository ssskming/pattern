package Mediator;

//使用User对象显示他们之间的通信
public class MediatorPatternDemo {
	public static void main(String[] args) {
		User rebert = new User("Robert");
		User john = new User("John");
		
		rebert.sendMessage("Hi! John!");
		john.sendMessage("Hello Robert!");
	}
}	
