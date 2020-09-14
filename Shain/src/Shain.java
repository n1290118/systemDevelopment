
public class Shain {

	protected String name;


	public Shain() {name="名無し";}
	public void setName(String nm) {name=nm;}
	public String getName() {return name;}

	public void printData(){ 						//情報を出力するメソッド
		System.out.println("[氏 名] : " + name); 	//氏名を見出し付きで出力
	}
}
