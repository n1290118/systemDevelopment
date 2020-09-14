public class Line {

	private Point[] pt;

	public Line(int sx, int sy, int ex, int ey) {
		pt=new Point[2];
		pt[0]=new Point(sx,sy);
		pt[1]=new Point(ex,ey);
	}

	public void move (int mvX, int mvY){
		int sx, sy, ex, ey;			//移動後の始点と終点

		sx=pt[0].getX()+mvX;
		sy=pt[0].getY()+mvY;
		ex=pt[1].getX()+mvX;
		ey=pt[1].getY()+mvY;

		pt[0]=new Point(sx,sy);
		pt[1]=new Point(ex,ey);


	}
	public void draw(Canvas canvas) {
		int x, y, n, width, height, wabs, habs, wflg, hflg;

		//直線の始点・終点がキャンパス内にあるか否かチェック

		if(pt[0].getX()< 0 || pt[0].getX() >=canvas.getSizeX() || pt[1].getX()<0 || pt[1].getX()>=canvas.getSizeX()) {
			System.out.println("***エラー：直線のx座標がキャンバス外です。");
			return;
		}

		if(pt[0].getY()< 0 || pt[0].getY() >=canvas.getSizeY() || pt[1].getX()<0 || pt[1].getY()>=canvas.getSizeY()) {
			System.out.println("***エラー：直線のy座標がキャンバス外です。");
			return;
		}

		width = pt[1].getX() - pt[0].getX(); 			//幅を計算
		height = pt[1].getY() - pt[0].getY(); 			//高さを計算
		wabs = Math.abs(width); 						//幅の絶対値
		habs = Math.abs(height);						 //高さの絶対値
		wflg=1;											 //ｘ座標の描画順フラグ
		hflg=1;											 //ｙ座標の描画順フラグ
		if ( width<0) wflg=-1;
		if ( height < 0) hflg = -1;
		if( wabs > habs ){ 								//幅の方が大きい(絶対値で)
			for(n = 0; n <= wabs; n++){ 					//幅を基準にしてループ
				x = pt[0].getX() + n * wflg; 					//点を打つべき座標を計算
				y = pt[0].getY() + (int)(habs * n / wabs) * hflg;
				System.out.println ("***点の描画：" + x + ":" + y);
		canvas.draw(x, y);								 //キャンバスに点を打つ
		}
		}else{ 													//高さの方が大きいか等しい
		for(n = 0; n <= habs; n++){ 							//高さを基準にしてループ
		y = pt[0].getY() + n * hflg;							 //点を打つべき座標を計算
		x = pt[0].getX() + (int)(wabs * n / habs) * wflg;
		System.out.println ("+++点の描画：" + x +":" + y);
		canvas.draw(x, y); 										//キャンバスに点を打つ
		}
		}
	}

}
