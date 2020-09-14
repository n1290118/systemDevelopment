import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class JavaRen2{
	public static void main(String args[]) throws IOException {
		BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));
		char mark;
		int size,i;
		System.out.print("全角文字を入力：");
		mark = (char)bin.read();
		bin.readLine();
		System.out.print("サイズを入力：");
		size = Integer.parseInt(bin.readLine());
		for(i = 0;i < size;i++){
			String buf = "";
			int j;
			for(j = 0; j < size * 2 -1 ;j++){
				if(i + j < size - 1 || j - i >= size ){
						//テキストのプログラムのメッセージを参考に作成してみよう
					buf=buf+'　';
				}else{
					buf=buf+mark;
					//テキストのプログラムのメッセージを参考に作成してみよう
				}
			}
			System.out.println(buf);
		}
	}
}