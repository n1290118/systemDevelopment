public class Kadai01{
	private static Canvas canvas;

	private static Line lines[];

	public static void main(String args[]) {
		canvas = new Canvas(20,12); //幅20文字、高さ12文字のキャンバスを生成
		lines = new Line[5]; //Line型の配列を用意
		lines[0] = new Line(1,1,10,10); //(1,1)と(10,10)を結ぶ直線
		lines[0].draw(canvas);
		lines[0].move(0,5); //この直線を縦方向に平行移動
		lines[0].draw(canvas);
		canvas.display(); //キャンバスの内容を画面に出力する
		}
}
