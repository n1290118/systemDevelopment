import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class JavaRen1{
	public static void main(String args[]) throws IOException {
		BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));
		String msg;
		double height,weight;
		System.out.print("氏名を入力：");
		msg = bin.readLine();

		msg=msg+"さんの標準体重は";
		System.out.print("身長を入力：");

		height = Double.parseDouble(bin.readLine());

		weight = (height - 100) * 0.9;
		msg = msg + weight + "kgです";
		//テキストのプログラムのメッセージを参考に作成してみよう
		System.out.println(msg);
	}
}