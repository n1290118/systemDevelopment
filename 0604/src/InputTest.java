import java.io.*;

public class InputTest {

	public static void main(String[] args) throws IOException{
		BufferedReader bin=new BufferedReader(new InputStreamReader(System.in));
		String name;											//氏名格納用
		int dt;													//得点格納用
		int cnt=0,sum=0;										//件数カウンタ、合計用
		System.out.print("名前を入力:");
		name=bin.readLine();									//キーボードから1行入力
		System.out.print("得点を入力()-1で入力終了):");
		dt=Integer.parseInt(bin.readLine());					//キーボードから整数入力
		while(dt !=-1) {										//-1以外である間繰り返す
			sum=sum+dt;											//合計を計算
			cnt++;
			System.out.print("得点を入力(-1で入力終了);");
			dt=Integer.parseInt(bin.readLine());				//キーボードから整数を入力
		}
			System.out.println(name+"さんの合計点は"+sum+"点です");
			System.out.println(name+"さんの平均点は"+(sum/cnt)+"点です");
	}

}
