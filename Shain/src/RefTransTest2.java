
public class RefTransTest2 {

	public static void main(String[] args) {
		int i;
		Shain sAry[] = new Shain[3]; 		//Shainクラスの参照型配列
		Jimu j1 = new Jimu(); 				//Jimuクラスのオブジェクト
		Kanri k1 = new Kanri(); 			//Kanriクラスのオブジェクト
		j1.setName("鈴木"); j1.setKihon(265000); j1.setZangyo(56);
		k1.setName("田中"); k1.setYaku("部長"); k1.setKotei(398500);

		sAry[0] = j1; 						//Shainの参照でJimuのｵﾌﾞｼﾞｪｸﾄを指す
		sAry[1] = k1; 						//Shainの参照でkanriのｵﾌﾞｼﾞｪｸﾄを指す
		sAry[2] = new Shain(); 				//Shainの参照でJimuのｵﾌﾞｼﾞｪｸﾄを指す

		for(i = 0; i < sAry.length; i++){ 	//全要素数繰り返す
			sAry[i].printData(); //各情報を出力させる
			System.out.println("---------------");
		//System.out.println("氏名 : " + sAry[i].getName()); //氏名を出力
		}
		Jimu j2;					 	//Jimuクラスの参照型 j2
		Kanri k2;					 	//Kanriクラスの参照型 k2
		j2 = (Jimu)sAry[0]; 			//sAry[0]はJimu型のｵﾌﾞｼﾞｪｸﾄを指してるのでOK
		System.out.println(j2.getName() + "さんの給与 : " + j2.calcSalary());
		k2 = (Kanri)sAry[1]; 			//sAry[1]はKanri型のｵﾌﾞｼﾞｪｸﾄを指してるのでOK
		System.out.println(k2.getName() + "さんの給与 : " + k2.calcSalary());
	}

}
