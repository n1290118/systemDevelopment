
public class Review03 {
	private static Student2 st[] = new Student2[3]; //Student参照型配列

	public static void main(String args[]){
		st[0] = new NormalStudent("Sato", 0.76, 80); //一般学生を生成
		st[1] = new ScholarStudent("Goto", 0.78, 'A'); //奨学生を生成
		st[2] = new NormalStudent("Kato", 0.68, 75); //一般学生を生成

		for(int i = 0; i < st.length; i++){ //全学生まとめてﾙｰﾌﾟ
			System.out.print(st[i].toString()); //学生の情報出力
			if(st[i].canNextGrade() == true){ //進級可能かどうか？
				System.out.println("→進級可");
			}else{
				System.out.println("→進級不可");
			}


		}
	}
}