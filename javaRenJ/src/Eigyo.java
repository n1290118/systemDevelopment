public class Eigyo extends Shain {
	private int kihon;
	private int uriage;

	public Eigyo(){
		super();
		kihon=0;
		uriage=0;
	}

	public void setKihon(int kihon){ this.kihon = kihon; }

	public void setUriage(int uriage){ this.uriage = uriage; }


	public int calcSalary(){ return( kihon + (int)(uriage*0.01) ); }

	public void printData(){
		super.printData();
		System.out.println("[基 本 給] : " + kihon);
		System.out.println("[売上金額] : " + uriage);
		System.out.println("[給　　与] : " + calcSalary());
	}
}
