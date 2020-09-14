
public class Check01 {

	public static void main(String[] args) {

		System.out.println("【九九表】");
		int a;
		for(a=0;a<15;a++) {
			System.out.print("■");
		}
		String str[][]=new String[9][9];
		int i,j;
		for(i=0;i<str.length;i++) {
			for(j=0;j<str[0].length;j++) {
				int ans=(i+1)*(j+1);
				str[i][j]="";
				if(ans<10) {
					str[i][j]=str[i][j]+" ";
						}
				str[i][j]=str[i][j]+ans;
				}
			}
		for(i=0;i<str.length;i++) {
			for(j=0;j<str[0].length;j++) {
				System.out.print(str[i][j]+" ");
			}
			System.out.println();
		}
	}

}
