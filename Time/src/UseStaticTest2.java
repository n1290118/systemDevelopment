
public class UseStaticTest2 {

	public static void main(String[] args) {
		System.out.println("起床 : " + Time.toString(6,45,0));
		Time t1 = new Time(); //Timeクラスのオブジェクトを生成
		Time t2 = new Time(); //Timeクラスのオブジェクトを生成
		t1.setTime(7, 31, 30); //t1に 7時31分30秒 をセット
		t2.setTime(8, 17, 00); //t2に 8時17分00秒 をセット
		System.out.println("出発 : " + t1.toString()); //t1をｲﾝｽﾀﾝｽﾒｿｯﾄﾞで文字列化*4
		System.out.println("到着 : " + t2.toString()); //t2をｲﾝｽﾀﾝｽﾒｿｯﾄﾞで文字列化

	}

}
