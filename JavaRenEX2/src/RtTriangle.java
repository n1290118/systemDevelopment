public class RtTriangle extends Figure{
	private int x, y;
	private int w, h;
	
	public RtTriangle(String name, int x, int y, int w, int h){
		setName(name);
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}
	
	public void printInf(){
		super.printInf();
		System.out.println("左下座標(" + x + " , " + y + ") 幅 " + w + " 高さ " + h + "の直角三角形です");
	}
	
	public int calcArea(){
		return( w * h / 2 );
	}
}
