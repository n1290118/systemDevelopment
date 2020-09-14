class JavaRenF{
	public static void main(String args[]){
		Rect2.printRect(13,1);
		Rect2 rect1 = new Rect2();
		Rect2 rect2 = new Rect2();
		System.out.println("<<１辺５の正方形>>");
		rect1.setRect(5);
		System.out.println("面積は " + rect1.calcArea() +"です");
		rect1.printRect();
		System.out.println("<<幅８×高さ３の長方形>>");
		rect2.setRect(8, 3);
		System.out.println("面積は " + rect2.calcArea() +"です");
		rect2.printRect();
		System.out.println("面積の合計は " + Rect2.totalArea + "です");
		Rect2.printRect(13,1);
	}
}
