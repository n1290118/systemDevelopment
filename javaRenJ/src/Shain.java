public class Shain{
	protected String name;				//社員氏名※
	
	public Shain(){ name = "名無し"; }			//引数なしのコンストラクタ
	public void setName(String name){ this.name = name; }	//氏名をセットするメソッド
	public String getName(){ return name; }		//氏名を取得するメソッド
	public void printData(){				//情報を出力するメソッド
		System.out.println("[氏　　名] : " + name);	//氏名を見出し付きで出力
	}

}
