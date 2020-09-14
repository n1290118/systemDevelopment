import java.io.*;

class JavaRenB {
	public static void main(String args[]) throws IOException {
		BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));

		String names[] = {"Kudoh", "Satoh", "Katoh", "Saitoh", "Sudoh"};	//氏名群
		String adrss[] = {"Aichi", "Kyoto", "Chiba", "Miyagi", "Tokyo"};	//住所群

		Address adAry[] = new Address[names.length];
		int i;
		String findStr;						//検索対象氏名入力用

		for(i=0;i<adAry.length;i++) {
			adAry[i]=new Address();
			adAry[i].name=names[i];
			adAry[i].address=adrss[i];
		}

		System.out.print("検索氏名(前方一致) : ");
		findStr = bin.readLine();			//検索したい氏名を入力させる
		for(i = 0; i <  adAry.length; i++){	//住所情報検索ループ
			if(adAry[i].match(findStr) == true){
				System.out.println(adAry[i].name + " : " + adAry[i].address);
			}
		}
	}
}
