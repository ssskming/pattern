package state;

public class StartState implements State {
	
	public void doAction(Context context) {
		System.out.println("Playter is in start state");
		context.setState(this);
	};
	
	public String toString(){
		return "Start State";
	}
}
