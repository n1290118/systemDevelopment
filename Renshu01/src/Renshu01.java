
public class Renshu01 {
	public static void main(String args[]){
		Product pr1 = new Product("A01", "えんぴつ");
		Product pr2 = new Product("A03", "消しゴム");
		Product pr3 = pr1;
		pr1.setPrice(100);
		System.out.println(pr1.toString());
		System.out.println(pr2.toString());
	}
}