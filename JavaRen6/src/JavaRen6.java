import java.io.*;

class JavaRen6{
	 public static void main(String args[]){
		BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));
		//テキストのプログラムのメッセージを参考に作成してみよう
		int i,j;

		for(i = 0;i < 10;i++) {
			for(j = 0;j < 10;j++) {
				if( (i+j) % 2 ==0){
					System.out.print("■");
				}else {
					System.out.print("□");
				}
			}
			System.out.println();
		}

		}
}
