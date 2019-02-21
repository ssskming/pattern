package command;

//创建一个被耍了Order接口的实体类
public class SellStock implements Order {
	private Stock abcStock;
	
	public SellStock (Stock abcStock){
		this.abcStock = abcStock;
	}
	public void execute() {
		abcStock.sell();
	}

}
