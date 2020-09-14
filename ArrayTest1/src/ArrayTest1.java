import java.io.*;

public class ArrayTest1 {

	public static void main(String[] args) throws IOException{
		BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));
		int n[]; 		//各総和を格納する配列(要素数未定)
		int cnt, i; 	//入力された値の格納用、ﾙｰﾌﾟｶｳﾝﾀ用
		System.out.print("値を入力 : ");
		cnt = Integer.parseInt(bin.readLine());//入力された値を cntに格納
		System.out.println();
		n = new int[cnt+1]; 	//必要な要素数を確保(※１)
		for(i = 1; i < n.length; i++){
		n[i] = n[i-1] + i; 		//各要素に、総和を計算して格納(※２)
		}
		for(i = 1; i < n.length; i++){ //出力ループ
		System.out.println("1～" + i + "の合計は " + n[i] + "です");
		}
	}
	}



