class Score{
	static int eng;
	static int mth;
	static int jpn;

	public static int calcSum(){
		//クラスScoreの仕様を参照に作成してみよう
		return eng + mth + jpn;
	}

	public static double calcAvg(){
		//クラスScoreの仕様を参照に作成してみよう
		return(eng + mth + jpn)/3.0;
	}

	public static void printScores(String name){
		System.out.println(name + "さん： 英語 " + eng + "点 数学 " + mth + "点 国語 " + jpn + "点");
	}
}