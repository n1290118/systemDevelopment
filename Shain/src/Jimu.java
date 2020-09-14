
public class Jimu extends Shain{
	private int kihon; 			//基本給
	private int zangyo; 			//残業時間
	public Jimu(){ 					//引数なしのコンストラクタ
		super() ;
		//name = "名無し"; 				//継承したﾌｨｰﾙﾄﾞnameに代入
		kihon = 0;
		zangyo = 0;
	}
	public void setKihon(int kh) { kihon = kh; } 		//基本給をセットするメソッド
	public void setZangyo(int zg) { zangyo = zg; } 	//残業時間をセットするメソッド
	public int calcSalary(){ //給与を計算するメソッド
	return( kihon + (int)((kihon/165) * 1.3 * zangyo) );
	}
	public void printData(){ 							//情報を出力するメソッド
		super.printData(); 								//ｽｰﾊﾟｸﾗｽの処理で氏名を出力
		//System.out.println("[氏 名] : " + name);		//氏名を見出し付きで出力
		System.out.println("[基 本 給] : " + kihon); 	//基本給を見出し付きで出力
		System.out.println("[残業時間] : " + zangyo); 	//残業時間を見出し付きで出力
		System.out.println("[給 与] : " + calcSalary()); //給与を出力
		}
	}


