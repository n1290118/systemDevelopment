public class Rect extends Figure{
	private int x1, y1;
	private int x2, y2;

	public Rect(String name, int x1, int y1, int x2, int y2){
		setName(name);
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	public int calcWidth () {
		return(x2-x1);
	}

	public int calcHeight() {
		return(y2-y1);
	}
	public void printInf(){
		super.printInf();
		System.out.println("左上座標(" + x1 + " , " + y1 + ") 幅 " +calcWidth()+"高さ"+calcHeight()+ "の長方形です");
	}

	public int calcArea(){
		return( calcWidth() * calcHeight() );
	}
}
