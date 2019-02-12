package factory;

public class FactoryProducer {
	public static AbstractFactory getFactroy(String choice){
		if (choice.equalsIgnoreCase("SHAPE")){
			return new ShapeFactory();
		} else if (choice.equalsIgnoreCase("COLOR")){
			return new ColorFactory();
		} 
		return null;
	}
}
