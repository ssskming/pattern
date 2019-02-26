package businessDelegate;

//创建客户端
public class Client {
	BusinessDelegate businessService;
	
	public Client(BusinessDelegate businessDelegate){
		this.businessService = businessDelegate;
	}
	public void doTask(){
		businessService.doTask();
	}
}
