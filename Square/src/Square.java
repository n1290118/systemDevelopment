class Square { 					//正方形に関するﾌｨｰﾙﾄﾞ/ﾒｿｯﾄﾞをまとめたクラス
		int length;		 //一辺の長さ
		public int calcArea(){ 		//面積を求める
			int area = length * length;
			return area; 					//計算した面積を返す
			}
		public void display(){ 	//形を出力する
			int i ,j;
			for(i = 0; i < length; i++){ 	//length行length個の■を出力
				for(j = 0; j < length; j++){
				System.out.print("■");
					}
				System.out.println();
					}
			}
}