package visitor;

//使用 ComputerPartDisplayVisitor 来显示 Computer 的组成部分。
public class VisitorPatternDemo {

	public static void main(String[] args) {
		ComputerPart computer = new Computer();
		computer.accept(new ComputerPartDisplayVisitor());
	}

}
