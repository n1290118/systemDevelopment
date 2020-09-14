class MethodTest2 {
	public static void main(String args[]){
		int suu[] = {12, 20, 31, 16, 29, 33}; 	//int型の配列 suu
		int i;
		System.out.print("メソッド実行前："); 	//↓配列 suuの全要素を出力
		for(i = 0; i < suu.length; i++){ System.out.print(suu[i] + " "); }
		System.out.println();
		bai(suu);
		System.out.print("メソッド実行後："); 	//↓配列 suuの全要素を出力
		for(i = 0; i < suu.length; i++){ System.out.print(suu[i] + " "); }
		System.out.println();
	}
	public static void bai(int retu[]){
		int i;
		for(i = 0; i < retu.length; i++){ 		//配列の全要素に対するﾙｰﾌﾟ
			retu[i] = retu[i] * 2; 				//配列の各要素を２倍に
		}
	}
}