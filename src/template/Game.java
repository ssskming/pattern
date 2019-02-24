package template;

//����һ�������࣬����ģ�巽��������Ϊ final��
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
