class JavaRen4{
	public static void main(String args[]){
		char board[][] = new char[5][7];
		int i, j;
		for(i = 0; i < board.length; i++){
			for(j = 0; j < board[i].length; j++){
				board[0][j]='■';
				board[board.length-1][j]='■';


				//テキストのプログラムのメッセージを参考に作成してみよう
			}
		}
		for(i = 0; i < board.length; i++){
			for(j = 0; j < board[i].length; j++){
				board[i][0]='■';
				board[board.length-1][i]='■';

				//テキストのプログラムのメッセージを参考に作成してみよう
				System.out.print(board[i][j]);;
			}
			System.out.println();
		}
	}
}
