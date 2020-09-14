package jp.ac.isc.cloud;

public class FortuneSlip {
	public String getRandomItem() {
		String item;
		switch ((int)(Math.random() * 4)) {
		case 0:
			item = "/image/dai.gif";
			break;
		case 1:
			item = "/image/kichi.gif";
			break;
		case 2:
			item = "/image/sue.gif";
			break;
		default:
			item = "/image/kyo.gif";
			break;
		}
		return item;
	}
}