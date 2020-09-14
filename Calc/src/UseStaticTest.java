
public class UseStaticTest {

	public static void main(String[] args) {
		int x = 10, y = 5, ans;
		double d = 1.75, e = 12.65, dans;

		ans = Calc.add(x, y); 			//staticﾒｿｯﾄﾞadd呼び出し
		System.out.println(x + " + " + y + " = " + ans);

		ans = Calc.sub(x, y); 			//staticﾒｿｯﾄﾞsub呼び出し
		System.out.println(x + " - " + y + " = " + ans);

		dans = Calc.add(d, e); 			//staticﾒｿｯﾄﾞadd呼び出し
		System.out.println(d + " + " + e + " = " + dans);

		System.out.println("円周率は" + Calc.PI + "です");	//staticﾌｨｰﾙﾄﾞPIを参照
	}

}
