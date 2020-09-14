public class Circle extends Figure{
	//クラスCircleの仕様を参考に作成してみよう
	private int x, y;
	private int r;

	public Circle(String name, int x, int y, int r){
		setName(name);
		this.x = x;
		this.y = y;
		this.r = r;
	}

	public void printInf(){
		super.printInf();
		System.out.println("中心座標(" + x + " , " + y + ") 半径 "  + r + "の円です");
	}

	public int calcArea(){
		return(int)( r * r * 3.141593 );
	}
}
