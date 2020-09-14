
public class Group {
	private String name;
	private Student members[];
	private int memberCnt = 0;
	
	public Group(String name,int maxCnt){
		this.name = name;
		members = new Student[maxCnt];
	}

	public String getName() {
		return name;
	}

	public Student[] getMembers() {
		Student mCopy[] = new Student[memberCnt];
		System.arraycopy(members, 0, mCopy, 0, memberCnt);
		return mCopy;
	}
	public void addStudent(Student st){
		members[memberCnt] = st;
		memberCnt++;
	}
	public Student findStudent(String name){
		int i;
		for(i = 0;i < memberCnt;i++){
			if(members[i].getName().equals(name) == true){
				return members[i];
			}
		}
		return null;
	}
}
