class Renshu05{
	private static Product pr[] = new Product[3]; //製品クラスの参照型配列
	public static void main(String args[]){
		pr[0] = new NewProduct("テ レ ビ", 249800, 0.2); //新品製品
		pr[1] = new UsedProduct("エアコン", 126800, 5); //中古品製品
		pr[2] = new JunkProduct("ビ デ オ", 109800, 15, "電源入らない"); //ｼﾞｬﾝｸ品
		System.out.println(pr[0].toString());
		System.out.println(pr[1].toString());
		System.out.println(pr[2].toString());
}
}