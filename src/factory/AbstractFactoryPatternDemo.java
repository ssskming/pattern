package factory;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		//���ݲ�������ȡ��״����
		AbstractFactory shapeFactory = FactoryProducer.getFactroy("SHAPE");
		
		//��ȡ��״Ϊcircle�Ķ���
		Shape shape1 = shapeFactory.getShape("CIRCLE");
		shape1.draw();
		
		//��ȡ��״ΪRectangle�Ķ���
		Shape shape2 = shapeFactory.getShape("RECTANGLE");
		shape2.draw();
		
		
		//���ݲ�������ȡ��ɫ����
		AbstractFactory colorFactory = FactoryProducer.getFactroy("COLOR");
		
		//��ȡ��ɫBLUE����
		Color color1 = colorFactory.getColor("BLUE");
		color1.fill();
		
		//��ȡ��ɫGREEN����
		Color color2 = colorFactory.getColor("GREEN");
		color2.fill();
	}

}
