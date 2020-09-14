public class NewProduct extends Product { //新品商品クラス
	private double discountRatio; //割引率
	//↓値をセットするｺﾝｽﾄﾗｸﾀ
	public NewProduct(String name, int price, double discountRatio){
		this.name = name;
		this.price = price;
		this.discountRatio = discountRatio;
	}
	public String toString(){ //情報文字列化のｵｰﾊﾞﾗｲﾄﾞﾒｿｯﾄﾞ
		return super.toString() + " 特価：" + buyPrice() + "円";
		//↑情報を文字列化
	}
//↓売値を返すﾒｿｯﾄﾞのｵｰﾊﾞﾗｲﾄﾞ
	public int buyPrice(){ return price - (int)(price * discountRatio); }
} //↑割引率によって計算