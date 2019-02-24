package template;

public class Cricket extends Game{

	@Override
	void initialize() {
		System.out.println("Circket Game Finished!");
	}

	@Override
	void startPlay() {
		 System.out.println("Cricket Game Initialized! Start playing.");
	}

	@Override
	void endPlay() {
		System.out.println("Cricket Game Started. Enjoy the game!");
	}
	
}
