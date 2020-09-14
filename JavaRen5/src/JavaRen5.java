import java.io.*;

class JavaRen5{
	public static void main(String args[]){
		BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));

		int dt[]= {68,80,75,63,97,45};		/*平均を求めたい値の配列*/
		int sum=0,i;						/*合計用、ループカウンタ*/
		double avg;						/*平均点用*/
		//テキストのプログラムのメッセージを参考に作成してみよう

		for(i=0;i<6;i++) {
			sum+=dt[i];
		}

		avg=sum/6.0;
		System.out.println("平均は" + avg + "点です");
	}
}
