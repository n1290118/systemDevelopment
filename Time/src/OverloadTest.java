
public class OverloadTest {

	public static void main(String[] args) {
		Time t1 = new Time(); 			//Timeクラスのオブジェクトを生成
		Time t2 = new Time(); 			//Timeクラスのオブジェクトを生成
		t1.setTime(10, 14, 39);			 //①引数３つの setTimeﾒｿｯﾄﾞ呼び出し
		t2.setTime("PM", 3, 30, 15); 	//②引数４つの setTimeﾒｿｯﾄﾞ呼び出し
		System.out.println("t1は " + t1.getHour() + "時 " +
		t1.getMinute() + "分 " + t1.getSecond() + "秒です");
		System.out.println("t2は " + t2.getHour() + "時 " +
		t2.getMinute()+ "分 " + t2.getSecond() + "秒です");
		System.out.println("setTimeﾒｿｯﾄﾞは" + Time.setTimeCnt + "回呼び出された");
	}
}
