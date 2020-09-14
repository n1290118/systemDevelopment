import java.io.IOException;

public class JavaRenG{
	public static void main(String args[]) throws IOException{
		int val[];
		int i, sum = 0;
		System.out.print("足し算のみの式を入力 : ");
		val = EasyIn.readInt('+');
		for(i = 0; i < val.length; i++){
			sum = sum + val[i];
		}
		System.out.println("結果は " +sum + "です");
	}
}