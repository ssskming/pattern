package Mediator;

//ʹ��User������ʾ����֮���ͨ��
public class MediatorPatternDemo {
	public static void main(String[] args) {
		User rebert = new User("Robert");
		User john = new User("John");
		
		rebert.sendMessage("Hi! John!");
		john.sendMessage("Hello Robert!");
	}
}	
