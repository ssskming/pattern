package command;

//创建一个被耍了Order接口的实体类
public class BuyStock implements Order {
	private Stock abcStock;
	
	public BuyStock(Stock abcStock){
		this.abcStock = abcStock;
	}
	
	public void execute(){
		abcStock.buy();
	}

}
