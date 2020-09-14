
public class RefTransTest {

	public static void main(String[] args) {
		Jimu j1;
		Shain s1; //Shainｸﾗｽの参照型 s1を宣言
		j1 = new Jimu(); //s1でJimuｸﾗｽのｵﾌﾞｼﾞｪｸﾄを指す
		s1=j1;
		j1.setName("岩崎");
		System.out.println(s1.getName());
	}

}
