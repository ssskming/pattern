package prototype;

public class Rectangle extends Shape {
	
	public Rectangle(){
		type = "Rectangle";
	}
	
	@Override
	void draw() {
		System.out.println("Inside Rectangle: drwa() method.");
	}
	
}
