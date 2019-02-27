package frontController;

public class FrontControllerPatternDemo {

	public static void main(String[] args) {
		FrontController fronController = new FrontController();
		
		fronController.dispatchRequest("HOME");
		fronController.dispatchRequest("STUDENT");
	}

}
