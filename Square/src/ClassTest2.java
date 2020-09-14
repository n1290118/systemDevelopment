
public class ClassTest2 {

	public static void main(String[] args) {
		Square sq1, sq2; 		//Square クラスの参照型を２つ宣言
		sq1 = new Square(); 	//オブジェクトを生成し、sq1 で指す
		sq2 = sq1; 				//これで、sq2 も同じオブジェクトを指す

		sq1.length = 5; 			//sq1 の指すオブジェクト内のフィールドに値を代入
		System.out.println("sq1 の面積は " + sq1.calcArea() + "です");
		System.out.println("sq2 の面積は " + sq2.calcArea() + "です");
	}

}
