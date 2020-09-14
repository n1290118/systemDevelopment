
public class Product {
	private String code, name; //商品コード、商品名
	private int price; //価格
		public Product(String code, String name, int price){ //コンストラクタ
			this.code = code;
			this.name = name;
			price = price;
	}
		public void setPrice(int price){ //税金を加えて価格を設定するﾒｿｯﾄﾞ
			this.price = (int)(price * 1.1);
	}
		public String toString(){ //内容を文字列化するメソッド
			return code + ":" + name + "¥t" + price + "円";
		}
	}

