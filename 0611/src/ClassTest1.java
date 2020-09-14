class ClassTest1 {
	public static void main(String args[]){
		int area;
		Square sq1=new Square();
		Square sq2=new Square();
		System.out.println("【一辺の長さが ５の正方形】");
		sq1.length = 5; 			//一辺の長さを設定
		sq1.display(); 			//正方形の形を出力
		area = sq1.calcArea(); 	//正方形の面積を計算
		System.out.println("【一辺の長さが 3の正方形】");
		sq2.length = 3; 	//sq1の一辺に長さを3に
		sq2.display(); 			//sq2の形を出力
		area = sq1.calcArea()+sq2.calcArea();
		System.out.println("面積は " + area + "です");
	}
}