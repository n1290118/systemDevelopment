class AccessTest{
	public static void main(String args[]){
		Time t1 = new Time();
		Time t2 = new Time(); //Time クラスのオブジェクトを生成
		t1.setTime(38, -14, 99); //調整され、14時14分39秒が代入される
		t2.setTime(12, 30, 15); //12 時30分15 秒が代入される
		System.out.println("t1は " + t1.getHour() + "時 " +
				t1.getMinute() + "分 " + t1.getSecond() + "秒です");
		System.out.println("t2は " + t2.getHour() + "時 " +
				t2.getMinute() + "分 " + t2.getSecond() + "秒です");
	}
}