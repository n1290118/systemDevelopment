class Chokuho {
	double width;		// 幅
	double depth;		// 奥行き
	double height;		// 高さ

	public double calcBottomArea() 	{	// 底面の面積を計算して返す
		return width*depth;
	}

	public double calcSurfaceArea() {	// 表面積を計算して返す
		return (calcBottomArea() + (width * height) + (depth * height)) * 2;
	}

	public double calcVolume() {		// 体積を計算して返す
		return calcBottomArea()*height;
	}

	public boolean isCube() {			// 立方体を判定
		if(width==depth&& depth==height) {
			return true;
		}
		else {
			return false;
		}
	}
}