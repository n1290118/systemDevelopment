import java.io.*;

class JavaRenC {
	public static void main(String args[]) throws IOException {
		BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));

		String types[]={"Information","Science","College","network","system","department"};
		TypingStr tAry[] = new TypingStr[types.length];	//↑入力問題文字列群
		String inputStr;								//入力文字列格納用
		int i;
//		double avg = 0.0;	// for option

		for(i = 0; i < types.length; i++){
			System.out.print("[問題] " + types[i] + " : ");	//問題表示
			tAry[i] = new TypingStr();
			tAry[i].typeStr = types[i];
			tAry[i].start();

			inputStr = bin.readLine();
			if(tAry[i].check(inputStr)==false) {i--;}

		}

		System.out.println("\n-----結果-----");
		for(i = 0; i < tAry.length; i++){
			tAry[i].dispResult();
//			avg += (double)tAry[i].elapsed / (double)tAry[i].typeStr.length();	// for option
		}

//		System.out.print("一打平均時間 ： ");		// for option
//		System.out.print(avg / (double)tAry.length);
//		System.out.println("ms");
	}
}
