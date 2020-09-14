public class PersonInf{
	private String addr;
	private String name;
	private int age;

	public PersonInf(){
		this("名無しの権兵衛", 0);
	}

	public PersonInf(String nm, int ag){
		//クラスPersonInfの仕様を参考に作成してみよう
		this("不定",nm,ag);
	}

	public PersonInf(String ad, String nm, int ag){
		setInf(ad, nm, ag);
	}

	public void setInf(String ad, String nm, int ag){
		addr = ad;
		name = nm;
		age = ag;
	}

	public void printInf(){
		//クラスPersonInfの仕様を参考に作成してみよう
		System.out.println("【住所】"+addr);
		System.out.println("【氏名】"+name);
		System.out.println("【年齢】"+age);

	}
}
