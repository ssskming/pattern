package factory;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		//根据参数，获取形状工厂
		AbstractFactory shapeFactory = FactoryProducer.getFactroy("SHAPE");
		
		//获取形状为circle的对象
		Shape shape1 = shapeFactory.getShape("CIRCLE");
		shape1.draw();
		
		//获取形状为Rectangle的对象
		Shape shape2 = shapeFactory.getShape("RECTANGLE");
		shape2.draw();
		
		
		//根据参数，获取颜色工厂
		AbstractFactory colorFactory = FactoryProducer.getFactroy("COLOR");
		
		//获取红色BLUE对象
		Color color1 = colorFactory.getColor("BLUE");
		color1.fill();
		
		//获取绿色GREEN对象
		Color color2 = colorFactory.getColor("GREEN");
		color2.fill();
	}

}
