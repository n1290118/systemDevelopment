public class MailSell extends Sell {
	private String address;
	private String name;

	public MailSell(String prName, int prPrice, String address, String name){
		super(prName, prPrice);
		this.address = address;
		this.name = name;
	}

	public int calcTotal() {
		return (getPrPrice()+500);
	}

	public void printData(){
		super.printData();
		System.out.println("[顧客住所] " + address);
		System.out.println("[顧客氏名] " + name);
		System.out.println("[送　　料] 500");
		System.out.println("[支払合計] " + calcTotal());
	}
}
