
public class ConstTest {

	public static void main(String[] args) {
		Time t1 = new Time(); //Timeクラスのオブジェクトを生成
		Time t2=new Time(12,30,50);

		System.out.println("t1は " + t1.toString() + "です");
		System.out.println("t2は"+t2.toString()+"です");
	}

}
