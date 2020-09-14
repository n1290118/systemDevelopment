
public class FileInfo {
	private String fileName;
	private int fileSize;

	public FileInfo(String fileName,int fileSize) {
		this.fileName=fileName;
		this.fileSize=fileSize;
	}
	public String getFileName(){
		return fileName;
	}
	public int getFileSize(){
		return fileSize;
	}
	public void addFileSize(int addSize){
		fileSize=fileSize+addSize;
	}

}
