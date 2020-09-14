
public class ProductStock {
	private Product product; //商品
		private int stock = 0; //在庫数
		public ProductStock(Product product, int stock){ //商品と在庫数をｾｯﾄ
			this.product = product;
			this.stock = stock;
	}
		public int getStock(){ return stock; } //在庫数を返す
		public void decreaseStock(int cnt){ stock = stock - cnt; } //在庫数を減らす
		public String toString(){ //情報を文字列化
			return product.toString() + " → 在庫数 " + stock + "個";
	}
}
