package serviceLocator;

//为 JNDI 查询创建 InitialContext。
public class InitialContext {
	public Object lookup(String jndiName){
		if (jndiName.equalsIgnoreCase("SERVICE1")){
			System.out.println("Service 1 ");
			return new Service1();
		}else if (jndiName.equalsIgnoreCase("SERVICE2")){
			System.out.println("Service 2 ");
			return new Service2();
		}
		return null;
	}
}
