
public abstract class Product { //商品クラス
	protected String name;
	//製品名
	protected int price;
	//標準価格
	//↓製品情報を返すメソッド
	public String toString(){ return name + " " + price + "円"; }
	public abstract int buyPrice(); //売値を返す抽象メソッド
}