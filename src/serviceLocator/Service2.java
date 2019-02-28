package serviceLocator;

public class Service2 implements Service {

	@Override
	public String getName() {
		return "service2";
	}

	@Override
	public void execute() {
		System.out.println("Executing Service2");
	}

}
