package factory;

public class ColorFactory extends AbstractFactory {

	@Override
	public Color getColor(String color) {
		if (color == null){
			return null;
		}
		if (color.equalsIgnoreCase("Green")){
			return new Green();
		} else if(color.equalsIgnoreCase("BLUE")){
			return new Blue();
		} 
		return null;
	}

	@Override
	public Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}
	
}	
