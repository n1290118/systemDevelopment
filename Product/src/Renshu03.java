
	public class Renshu03 {
		private static ProductStock prs[] = new ProductStock[3];
		public static void main(String args[]){
			prs[0] = new ProductStock(new Product("A01", "えんぴつ",100), 5);
			prs[1] = new ProductStock(new Product("A03", "消しゴム",50), 1);
			prs[2] = new ProductStock(new Product("B01", "クレヨン",450), 2);
			prs[1].decreaseStock(1);
		printStockInfo();
			}
		public static void printStockInfo(){
			int i;
			System.out.println("【在庫一覧】");
		for(i = 0; i < prs.length; i++){
		if(prs[i].getStock() > 0){
		System.out.println("¥t" + prs[i].toString());
		}
	}
	}
}
