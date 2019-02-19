package Flyweight;

public class FlyweightPatternDemo {
	private static final String colors[] =
		{"Red", "Green", "Blue", "White", "Black"};
	
	public static void main(String[] args) {
		
		for (int i = 0;i < 20 ;++i){
			Circle circle = (Circle)ShapeFactory.getCircle(getRandomColor());
		}
	}
	
	public static String getRandomColor(){
		return colors[(int)(Math.random()*colors.length)];
	}
	
	@SuppressWarnings("unused")
	private static int getRandomX(){
		return (int)(Math.random()*100);
	}
	@SuppressWarnings("unused")
	private static int getRandomY(){
		return (int)(Math.random()*100);
	}
}
