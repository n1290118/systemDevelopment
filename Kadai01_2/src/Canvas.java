public class Canvas {

	private char[][] screen;
	private int sizeX;
	private int sizeY;

	public Canvas(int sizeX, int sizeY) {
		screen=new char[sizeX][sizeY];
		this.sizeX=sizeX;
		this.sizeY=sizeY;

		int i,j;
		for(j=0;j<sizeY;j++) {
			for(i=0;i<sizeX;i++) {


			screen[i][j]='□';
			}
		}
	}

	public void draw(int x, int y) {
		screen[x][y]='■';
	}

	public void display() {
		int i,j;
		for(j=0;j<sizeY;j++) {
			for(i=0;i<sizeX;i++) {
				System.out.print(screen[i][j]);
				}
			System.out.println();
		}
	}
	public int getSizeX() {
		return sizeX;
	}
	public int getSizeY() {
		return sizeY;
	}
}
