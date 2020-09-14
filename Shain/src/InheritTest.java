
public class InheritTest {

	public static void main(String[] args) {
		Jimu j1 = new Jimu(); 					//Jimuクラスのｵﾌﾞｼﾞｪｸﾄ生成
		Kanri k1 = new Kanri(); 				//Kanriクラスのｵﾌﾞｼﾞｪｸﾄ生成
		j1.setName("Sugiuchi Kazuya"); j1.setKihon(265000); j1.setZangyo(56);
		k1.setName("Isohara Takashi"); k1.setYaku("部長"); k1.setKotei(398500);
		//System.out.println(j1.getName() + "さんの給与 : " + j1.calcSalary());
		//System.out.println(k1.getName() + "さんの給与 : " + k1.calcSalary());

		j1.printData(); 			//事務職社員の情報出力
		System.out.println("----------------------------");
		k1.printData(); 			//管理職社員の情報出力
	}

	}


