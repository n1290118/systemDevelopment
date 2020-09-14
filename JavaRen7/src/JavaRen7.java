import java.io.*;

        class JavaRen7{
        	public static void main(String args[]) throws IOException{
        		BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));
				int sum;
				double average;
        		System.out.println("---------- 得点情報 ----------");
				Score.eng = 85;
				Score.mth = 70;
				Score.jpn = 61;
				//テキストのプログラムのメッセージを参考に作成してみよう
				sum=Score.calcSum();
				average=Score.calcAvg();
				Score.printScores("Koizumi");
				System.out.println("合計は " + sum + "点　平均は " + average + "点です");
        	}
        }
