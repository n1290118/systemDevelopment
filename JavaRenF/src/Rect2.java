public class Rect2{
	public int width;
	public int height;
	public static int totalArea = 0;

	public void setRect(int w, int h){
		if(w < 0){ w = -w; }
		if(h<0) {h=-h;}
		width = w;
		height=h;
		//クラスRect2の仕様を参考に作成してみよう

		Rect2.totalArea = Rect2.totalArea + calcArea();
	}

	public void setRect(int w){
		setRect(w,w);
	}

	public int calcArea(){
		return width * height;
	}

	public void printRect(){
		Rect2.printRect(width, height);
	}

	public static void printRect(int wid, int hei){
		int i, j;
		for(i = 0; i < hei; i++){
			for(j = 0; j < wid; j++){
				System.out.print("■");
			}
			System.out.println();
		}
	}
}
