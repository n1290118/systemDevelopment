class JavaRenA {
	public static void main(String[] args) {
		Chokuho ch1 = new Chokuho();
		Chokuho ch2 = new Chokuho();

		ch1.width = 5.0;
		ch1.depth = 4.5;
		ch1.height = 8.5;

		ch2.width = 5.0;
		ch2.depth = 5.0;
		ch2.height = 5.0;

		System.out.println("ch1の表面積は" + ch1.calcSurfaceArea() + "です");
		System.out.println("ch1の体積は" + ch1.calcVolume() + "です");
		if(ch1.isCube() == true) {
			System.out.println("ch1は立方体です");
		}

		System.out.println("ch2の表面積は" + ch2.calcSurfaceArea() + "です");
		System.out.println("ch2の体積は"+ch2.calcVolume() + "です");
		if(ch2.isCube() == true) {
			System.out.println("ch2は立方体です");
		}
	}
}

