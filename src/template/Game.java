package template;

//创建一个抽象类，它的模板方法被设置为 final。
public abstract class Game {
	abstract void initialize();
	abstract void startPlay();
	abstract void endPlay();
	
	public final void play(){
		initialize();
		startPlay();
		endPlay();
	}
}
