	public class Kanri extends Shain{ 		//Shainをスーパクラスとする
		private String yaku; 					//役職名
		private int kotei; 					//固定給
		public Kanri(){ 						//引数なしのコンストラクタ
			super();
			//name = "名無し"; 						//継承したﾌｨｰﾙﾄﾞnameに代入
			yaku = "役職";
			kotei = 0;
		}
		public void setYaku(String yk){ yaku = yk; } 	//役職名をセットするメソッド
		public void setKotei(int kt){ kotei = kt; } 	//固定給をセットするメソッド
		public int calcSalary(){ return kotei; } 		//給与を計算するメソッド

		public void printData(){ //情報を出力するメソッド
			super.printData(); 							//ｽｰﾊﾟｸﾗｽの処理で氏名を出力
			//System.out.println("[氏 名] : " + name); //氏名を見出し付きで出力
			System.out.println("[固 定 給] : " + kotei); //固定給を見出し付きで出力
			System.out.println("[給 与] : " + calcSalary()); //給与を出力
		}
	}

