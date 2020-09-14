
public class Product{ //商品クラス
	private String code, name; //商品コード、商品名
	private int price; //価格

	public Product(String code, String name){ //コンストラクタ
		this.code = code;
		this.name = name;
		price = 0;
	}
	public void setPrice(int price){ //税金を加えて価格を設定するﾒｿｯﾄﾞ
		this.price = (int)(price * 1.1);
	}
	public String toString(){ //内容を文字列化するメソッド
		return code + ":" + name +  + price + "円";
	}
}
