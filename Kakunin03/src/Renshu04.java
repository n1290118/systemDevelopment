public class Renshu04 {

	private static FolderInfo folder;


public static void main(String args[]){

	folder = new FolderInfo ("My Documents");
	folder.addFile( new FileInfo ("sample.txt",1024));
	folder.addFile( new FileInfo ("test.doc",16380));


		dispFolderInfo();

	}


	public static void dispFolderInfo() {

		System.out.println("フォルダ名：" + folder.getName());
		System.out.println("サイズ：" + folder.calcSize() + "バイト");

	}

}