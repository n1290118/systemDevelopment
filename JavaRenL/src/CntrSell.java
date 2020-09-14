public class CntrSell extends Sell {
	private String storeName;
	private int usePoint;

	public CntrSell(String prName, int prPrice, String storeName, int usePoint){
		super(prName, prPrice);
		this.storeName = storeName;
		this.usePoint = usePoint;
	}
	public int calcTotal() {
		return (super.getPrPrice()-usePoint);
	}


	public void printData() {
		super.printData();
		System.out.println("[販売店名] " + storeName);
		System.out.println("[ポイント] " + usePoint);
		System.out.println("[支払金額] " + calcTotal());
	}
}

