public class JavaRenK{
	public static void main(String args[]){
		PersonInf p1 = new PersonInf();
		StudyInf s1 = new StudyInf();
		StudyInf s2 = new StudyInf("横浜市神奈川区", "岩崎太郎", 36, 80, 71, 79);
		
		p1.printInf();
		System.out.println("-------------------------");
		s1.printInf();
		System.out.println("-------------------------");
		s2.printInf();
	}
}
