public class UsedProduct extends Product { //中古品クラス
	private int used; //使用年数
	//↓値をセットするｺﾝｽﾄﾗｸﾀ
	public UsedProduct(String name, int price, int used){
		this.name = name;
		this.price = price;
		this.used = used;
	}
	public String toString(){ //情報文字列化のｵｰﾊﾞﾗｲﾄﾞﾒｿｯﾄﾞ
		return super.toString() + " 特価：" + buyPrice() + "円 : "+used+"年使用)";
	}
	//↓売値を返すﾒｿｯﾄﾞのｵｰﾊﾞﾗｲﾄﾞ
	public int buyPrice(){ return price - (int)(price * used) / 10; }
	} //↑使用年数によって計算