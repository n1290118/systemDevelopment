
public class JavaRenH {

	public static void main(String[] args) {
		Time t1=new Time();
		Time t2=new Time(12,30,50);
		Time t3=new Time("PM",5,30,00);
		Time t4=new Time(65000);
		System.out.println("t1は"+t1.toString()+"です");
		System.out.println("t2は"+t2.toString()+"です");
		System.out.println("t3は"+t3.toString()+"です");
		System.out.println("t4は"+t4.toString()+"です");
	}

}
