import java.io.*;
public class JavaRen3 {

	public static void main(String[] args)throws IOException {
		BufferedReader bin=new BufferedReader(new InputStreamReader(System.in));
		String name[];
		int score[];
		int cnt, i, maxIdx;

		System.out .print("クラスの人数を入力:");
		cnt = Integer.parseInt(bin.readLine());

		name = new  String[cnt];
		score= new int[cnt];

		for(i=0;i<cnt;i++) {
			System.out.print("氏名を入力:");
			name[i]=bin.readLine();
			System.out.print("得点を入力:");
			score[i]=Integer.parseInt(bin.readLine());
		}
			maxIdx = 0;
			for(i=1;i<score.length;i++) {
				if(score[i]>score[maxIdx]) {
					maxIdx=i;
				}
			}
			System.out.println("最高点は、"+name[maxIdx]+"さんの"+ score[maxIdx] + "点です");
		}
		}


