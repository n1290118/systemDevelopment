
public class FolderInfo {
	String name;
	int fileCnt = 0;
	FileInfo files[];

	public FolderInfo(String name) {
		this.name = name;
		files = new FileInfo[5];
	}

	public String getName() {
		return name;
	}
	public void addFile(FileInfo file){
		files[fileCnt] = file;
		fileCnt++;
	}
	public int calcSize(){
		int totalSize=0;
		for(int i=0; i<fileCnt;i++) {
			totalSize +=files[i].getFileSize();
		}

		return totalSize;


	}
}
