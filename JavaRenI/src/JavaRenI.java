public class JavaRenI{
	public static void main(String args[]){
		PersonInf p1 = new PersonInf("横浜市神奈川区", "岩崎太郎", 36);
		PersonInf p2 = new PersonInf("鈴木次郎", 19);
		PersonInf p3 = new PersonInf();
		
		p1.printInf();
		System.out.println("-------------------------");
		p2.printInf();
		System.out.println("-------------------------");
		p3.printInf();
	}
}
