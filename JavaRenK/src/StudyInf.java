public class StudyInf extends PersonInf{
	private int eng;
	private int jpn;
	private int mth;

	public StudyInf(){
		super();
		eng=0;
		jpn=0;
		mth=0;
	}

	public StudyInf(String addr, String name, int age, int eng, int jpn, int mth){

		super(addr,name,age);
		setScore(eng, jpn, mth);
	}

	public void setScore(int eng, int jpn, int mth){
		this.eng = eng;
		this.jpn = jpn;
		this.mth = mth;
	}

	public int calcAvg(){
		return( (eng + jpn + mth) / 3 );
	}

	public void printInf(){
		super.printInf();
		System.out.println("[平均] " + calcAvg() + "点");
	}
}
