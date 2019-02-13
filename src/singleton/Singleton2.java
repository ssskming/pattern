package singleton;

/**
 * JDK �汾��JDK1.5 ��
 * �Ƿ� Lazy ��ʼ������
 * �Ƿ���̰߳�ȫ����
 * ʵ���Ѷȣ��ϸ���
 * ���������ַ�ʽ����˫�����ƣ���ȫ���ڶ��߳�������ܱ��ָ����ܡ�
 * getInstance() �����ܶ�Ӧ�ó���ܹؼ���*/
public class Singleton2 {
	private volatile static Singleton2 singleton2;
	private Singleton2(){}
	public static Singleton2 getSingleton(){
		if (singleton2 == null){
			synchronized (Singleton.class){
				if (singleton2 == null){
					singleton2 = new Singleton2();
				}
			}
		}
		return singleton2;
	}
}
