public class BarGraph{
	private String title;
	private String items[];
	private int values[];
	private int itemCnt;

	public void setGraphInfo(String ttl,int cnt){
		title = ttl;
		items=new String[cnt];
		values = new int[cnt];
		itemCnt = 0;
	}

	public void addItem(String it,double val){

			if(itemCnt < items.length){
				if(it.length() > 6){
					items[itemCnt] = it.substring(0,6);
				}else{
					items[itemCnt]=it;
				}
				values[itemCnt] = (int)val;
				itemCnt++;

			}
	}

	public void printGraph(){
		System.out.println("<<<<<" + title + ">>>>>");
		System.out.println("            " + "0___"  + "10__" + "20__" + "30__" + "40__" + "50__" + "60__" + "70__" + "80__" + "90_" + "100%");
		for(itemCnt = 0;itemCnt<items.length;itemCnt++){
			String sikaku = "■■■■■■■■■■■■■■■■■■■■";
			String spaceStr = "　　　　　　";

			if(items[itemCnt].length() < 6){
				spaceStr = spaceStr.substring(0,6 - items[itemCnt].length());
			}else{
				spaceStr = "";
			}
			sikaku = sikaku.substring(0,(int)(values[itemCnt] / 5.0 + 0.5) + 1 );

			System.out.println(items[itemCnt] + spaceStr + "|" + sikaku);
		}
	}
}