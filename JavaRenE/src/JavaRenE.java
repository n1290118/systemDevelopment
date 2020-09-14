class JavaRenE{
	public static void main(String args[]){
		BarGraph grph = new BarGraph();					//棒グラフオブジェクトの生成
		grph.setGraphInfo("新入社員のここに注目する",5);//タイトルなどの設定
		grph.addItem("積極性・意欲",80.0);				//項目を追加
		grph.addItem("元気さ",57.0);
		grph.addItem("協調性",63.0);
		grph.addItem("人柄",26.5);
		grph.addItem("目の輝き",16.5);
		grph.printGraph();
	}
}

