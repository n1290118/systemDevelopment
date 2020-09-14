
public class Renshu02 {

	public static void main(String[] args) {
		FileInfo file1 = new FileInfo("saple.txt", 1024);
		FileInfo file2 = new FileInfo("test.doc", 16380);
		file1.addFileSize(512);
		FileInfo file3 = file2;
		System.out.println("file1：" + file1.getFileName() + "：" + file1.getFileSize() + "バイト");
		System.out.println("file2：" + file2.getFileName() + "：" + file2.getFileSize() + "バイト");
		System.out.println("file3：" + file3.getFileName() + "：" + file3
				.getFileSize() + "バイト");
	}

}
