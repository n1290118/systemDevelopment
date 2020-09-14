class Array1{
	static int ary[];
	static int cnt;

	public static void setSize(int size){
		ary = new int[size];
		cnt = 0;
	}

	public static void add(int val){
		if(cnt < ary.length){
			ary[cnt] = val;
			cnt++;
		}else{
			System.out.println("もう追加できません");
		}
	}

	public static void printData(){
		int i;
		System.out.print("内容：");
		for(i = 0; i < cnt; i++){
			System.out.print("「" + ary[i] + "」 ");
		}
		System.out.println();
	}

	public static int findMax(){
		int i, max;
		max = ary[0];
		for(i = 1; i < cnt; i++){
			if(ary[i] > max){
				max = ary[i];
			}
		}
		return max;
	}
}