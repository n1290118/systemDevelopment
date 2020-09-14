
public class ArrayTest2 {

	public static void main(String[] args) {
		String str[][] = new String[9][9]; //九九の表を格納する配列(※1)
		int i, j;
		for(i = 0; i < str.length; i++){ //九九の表を作る２重ループ
			for(j = 0; j < str[0].length; j++){
				int ans = (i+1)*(j+1); //i行j列目に格納する値を計算
				str[i][j] = ""; //文字列を初期化
				if(ans < 10){ //結果が１桁の場合
					str[i][j] = str[i][j] + " ";//結果の前にスペースを入れる
				}
				str[i][j] = str[i][j] + ans; //結果を連結する
			}
		}
		for(i = 0; i < str.length; i++){
			for(j = 0; j < str[0].length; j++){
				System.out.print(str[i][j] + " ");
		}
		System.out.println();
		}
	}
}
