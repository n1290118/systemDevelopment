public class JavaRenJ{
	public static void main(String args[]){
		Shain s1 = new Shain();
		Eigyo e1 = new Eigyo();
		Eigyo e2 = new Eigyo();
		s1.setName("Ishii Hisashi");
		e2.setName("Fujii Tadashi"); e2.setKihon(318000); e2.setUriage(5135600);
		s1.printData();
		System.out.println("------------------------------");
		e1.printData();
		System.out.println("------------------------------");
		e2.printData();
	}
}
