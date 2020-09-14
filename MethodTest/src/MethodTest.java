
import java.io.*;
class MethodTest {
	public static void main(String args[]) throws IOException {
		BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));
		//int radius; 				//半径格納用
		double area;			 	//面積格納用
		dispLine(); 				//dispLineﾒｿｯﾄﾞ(16行目)呼び出し
		System.out.print("半径を入力：");	//Ringクラスのフィールドにアクセス
		Ring.radius = Integer.parseInt(bin.readLine());					//半径をｷｰﾎﾞｰﾄﾞから入力
		area = Ring.calcArea();			//Ringクラスのメソッドを呼び出す 			//calcAreaﾒｿｯﾄﾞ(24行目)呼び出し
		System.out.println("その円の面積は " + area + " です"); 	//面積出力
		System.out.println("円周の長さは"+Ring.calcCircuit()+"です");
												//dispLineメソッド（15行目）呼び出し
		dispLine();										 //dispLineﾒｿｯﾄﾞ(16行目)呼び出し
	}
	public static void dispLine(){ 						//区切り線出力ﾒｿｯﾄﾞ(引数・返却値なし)※１
		int i;
		for(i = 0; i < 8; i++){ 							//■と□で線を出力するループ
			System.out.print("■□");
		}
		System.out.println();
}
	//public static double calcArea(int rad){ 				//円の面積計算ﾒｿｯﾄﾞ(引数・返却値あり)※１
		//double ans;
		//ans = rad * rad * 3.141593; 						//引数に渡された半径から面積計算
		//return ans; 										//求めた面積を返す
	}
