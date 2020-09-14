public class Time{
	private int hour; 		//「時」を格納するﾌｨｰﾙﾄﾞ
	private int minute; 	//「分」を格納するﾌｨｰﾙﾄﾞ
	private int second; 	//「秒」を格納するﾌｨｰﾙﾄﾞ
	public static int setTimeCnt = 0; //setTimeが呼び出された回数を数えるﾌｨｰﾙﾄﾞ

	public Time(){ 									//コンストラクタ
		this(10,10,30);
		System.out.println("コンストラクタ実行"); 	//テスト用 ※１
		//hour = 10; minute = 10; second = 30; 		//10:10:30を設定 ※２
		}
	public Time(int hh, int mm, int ss){ //引数ありのコンストラクタ
		System.out.println("コンストラクタ２実行"); //テスト用
		setTime(hh, mm, ss); //setTimeメソッドを呼び出す
	}

	public Time(String ap,int hh,int mm, int ss) {
		setTime(ap,hh,mm,ss);
	}
		public Time(int pass) {
			this(pass/3600, pass%3600/60,pass%60);
	}
	public void setTime(int hh, int mm, int ss){//時刻を24時制でｾｯﾄするﾒｿｯﾄﾞ
		if(hh < 0){ hh = - hh; } //負の値なら正の値に直す
		if(mm < 0){ mm = - mm; }
		if(ss < 0){ ss = - ss; }
		hour = hh % 24; 		//時が24以上にならないように調整して代入
		minute = mm % 60; 		//分が60以上にならないように調整して代入
		second = ss % 60; 		//秒が60以上にならないように調整して代入
		Time.setTimeCnt++;		//ｽﾀﾃｨｯｸﾌｨｰﾙﾄﾞsetTimeCntを１増やす
	}
	public void setTime(String ap, int hh, int mm, int ss){
		ap = ap.toUpperCase();
		if(ap.equals("PM") == true){
			hh = hh + 12;
		}
		setTime(hh, mm, ss);
	}

	public int getHour(){ return hour ; } //hourの値を返すだけのﾒｿｯﾄﾞ
	public int getMinute(){ return minute ; } //minuteの値を返すだけのﾒｿｯﾄﾞ
	public int getSecond(){ return second ; } //secondの値を返すだけのﾒｿｯﾄﾞ

	//↓時刻を文字列化するｽﾀﾃｨｯｸﾒｿｯﾄﾞ
	public static String toString(int hh, int mm, int ss){
	String str; //文字列化した結果格納用

	if(hh < 12){ //引数に渡された「時」が12未満なら
		str = "AM "; //「AM」(午前)で始める
		}else{ //そうでなければ
		str = "PM "; //「PM」(午後)で始める
		hh = hh - 12; //「時」を -12する

		}
		if(hh < 10){ str = str + "0"; } //引数に渡された「時」が1桁なら0付加
		str = str + hh + ":"; //「時」と「:」を付加する
		if(mm < 10){ str = str + "0"; } //引数に渡された「分」が1桁なら0付加
		str = str + mm + ":"; //「分」と「:」を付加する
		if(ss < 10){ str = str + "0"; } //引数に渡された「秒」が1桁なら0付加
		str = str + ss; //「秒」を付加する
		return str; //できあがった文字列を返す
		}

	public String toString(){ //時刻を文字列化するｲﾝｽﾀﾝｽﾒｿｯﾄﾞ
		String str; //文字列化した結果格納用
		str = Time.toString(hour, minute, second);//ｽﾀﾃｨｯｸﾒｿｯﾄﾞで文字列化
		return str; //できあがった文字列を返す
	}
}
