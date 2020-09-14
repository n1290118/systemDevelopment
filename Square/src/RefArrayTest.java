
public class RefArrayTest {

	public static void main(String[] args) {
		Square sqAry[]=new Square[5];		//Squareクラスの参照型配列sqAryを宣言
		int i;

		for(i = 0; i < 3; i++){ 			//３回ループ
			sqAry[i] = new Square(); 		//Square オブジェクトを生成
			sqAry[i].length = i * 2 + 1; 	//一辺の長さを i*2+1 に設定
			}
		sqAry[3] = sqAry[1]; 			//sqAry[3]がsqAry[1]と同じオブジェクトを指す
		sqAry[4] = sqAry[0]; 			//sqAry[4]がsqAry[0]と同じオブジェクトを指す

			for(i = 0; i < sqAry.length; i++){ 	//配列の要素数分ループ
				sqAry[i].display(); 			//正方形の形を出力させる
			}

	}
}