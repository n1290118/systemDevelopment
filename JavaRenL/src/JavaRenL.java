public class JavaRenL {
public static void main(String args[]) {
int i, total = 0;
Sell sellAry[] = new Sell[3];	//ｽｰﾊﾟｸﾗｽの参照配列
sellAry[0] = new CntrSell("DVDレコーダ", 69500, 
						                   "横浜駅前", 1200);
sellAry[1] = new MailSell("液晶テレビ", 123800, 
						           "横浜市神奈川区", "岩崎");
sellAry[2] = new CntrSell("デジタルカメラ", 32900, 
						               "秋葉原２号店", 3800);
	for(i = 0; i < sellAry.length; i++){
sellAry[i].printData();   //ｽｰﾊﾟｸﾗｽ参照でﾒｿｯﾄﾞ呼出
	System.out.println("-------------------------");
			total = total + sellAry[i].calcTotal();
	}
System.out.println("[売上合計] " + total);
}
}
