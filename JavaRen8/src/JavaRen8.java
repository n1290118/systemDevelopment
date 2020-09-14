import java.io.*;

public class JavaRen8 {				   //classの後ろにｱﾌﾟﾘｹｰｼｮﾝ名を入力
	public static void main(String args[]) throws IOException {
		BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));
		int val, max;
		Array1.setSize(10);
		while(true){
			System.out.print("数を入力：");
			val = Integer.parseInt(bin.readLine());
			if(val == -1){
				break;
			}
			Array1.add(val);
		}
		Array1.printData();
		max = Array1.findMax();
		System.out.println("最大値は " + max + "です");
	}
}