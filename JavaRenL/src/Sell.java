public abstract class Sell {
	private String prName;
	private int prPrice;

	public Sell(String prName, int prPrice){
		this.prName=prName;
		this.prPrice=prPrice;
	}

	public String getPrName(){ return( prName ); }

	public int getPrPrice(){ return( prPrice ); }

	public abstract int calcTotal();

	public void printData(){
		System.out.println("[販売商品]"+prName);
		System.out.println("[商品価格]"+prPrice);
	}
}
