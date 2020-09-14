public class JunkProduct extends UsedProduct { //ジャンク品クラス
	private String problem; //故障箇所・不具合などの情報
	//↓値をセットするｺﾝｽﾄﾗｸﾀ
	public JunkProduct(String name, int price, int usedYear, String problem){
		super(name, price, usedYear); //スーパクラスのｺﾝｽﾄﾗｸﾀ呼出*1
		this.problem = problem;
}
		//↓情報文字列化のｵｰﾊﾞﾗｲﾄﾞﾒｿｯﾄﾞ
	public String toString(){ return super.toString() + "《ジャンク》" + problem; }
//↓売値を返すﾒｿｯﾄﾞのｵｰﾊﾞﾗｲﾄﾞ
	public int buyPrice(){ return 1000; }
} //↑一律1000円とする