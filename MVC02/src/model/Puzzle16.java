package model;

public class Puzzle16 {

	private int[][] board;

	public void createBoard() {
		int n,i,j;
		board=new int[6][6];
		for(n=1;n<=16;n++) {
			do {
				i=(int)(Math.random()*4+1);
				j=(int)(Math.random()*4+1);
			}while(board[i][j]!=0);

			board[i][j]=n;
		}

	}

	public boolean clearCheck() {
		int n;
		for(n=0;n<=15;n++) {
			if(board[n / 4 + 1 ][n % 4 + 1 ]!=n+1) {

			return false;
			}
	}
			return true;
		}

	public int getCell(int i, int j) {
		if(board==null  || i<0 || i>board.length-3||
							j<0 || j>board[0].length-3) {return 0;}
		return board[i+1][j+1];
	}

	public void bonusBoard() {
		int n;
		board = new int[6][6];							//とりあえず全部０クリア
		for(n = 0; n < 14; n++){						//全てのマスを正しい位置に配置するループ
			board[n/4+1][n%4+1] = n+1;
		}
		board[4][4] = 15;								//ただし最後の２つだけは入れ替えて配置
		board[4][3] = 16;
	}

	public void moveSpace(int mi, int mj) {
		int i, j;
		for(i = 1; i <= 4; i++){						//空白マスを探すループ
			for(j = 1; j <= 4; j++){
				if(board[i][j] == 16){					//見つけたら
					if(board[i+mi][j+mj] != 0){			//移動先が外枠でなければ
						board[i][j] = board[i+mi][j+mj];	//入れ替える
						board[i+mi][j+mj] = 16;
						return;  						//入れ替えたらこれ以上処理しない
					}
				}
			}
		}
	}
}
