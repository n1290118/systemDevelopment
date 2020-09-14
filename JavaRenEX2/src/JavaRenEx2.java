public class JavaRenEx2{
	public static void main(String args[]){
		Figure fAry[] = new Figure[3];
		Rect r;
		int i, area, sum;

		fAry[0] = new Rect("なると巻き", 50, 300, 150, 380);
		fAry[1] = new Circle("がんもどき", 100, 230, 50);
		fAry[2] = new RtTriangle("こんにゃく", 50, 160, 100, 50);
		
		sum = 0;
		for(i = 0; i < fAry.length; i++){
			fAry[i].printInf();
			area = fAry[i].calcArea();
			System.out.println("面積は " + area + "です");
			sum = sum + area;
		}
		
		r = (Rect)fAry[0];
		System.out.print(r.getName() + "は ");
		if(r.calcWidth() > r.calcHeight()){
			System.out.println("横長です");
		}
		System.out.println("おでんの総面積は " + sum + "です");
	}
}
