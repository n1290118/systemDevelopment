
public class Renshu06 {
	private static Folder rootFolder;
	public static void main(String[] args) {
		rootFolder = new Folder("C:\\");
		Folder myDoc = new Folder("My Documents");
		myDoc.addChild(new File("sample.txt",512));
		Folder docs = new Folder("docs");
		docs.addChild(new File("hoge.doc",12680));
		myDoc.addChild(docs);
		myDoc.addChild(new File("favorite.bmp",124670));
		rootFolder.addChild(myDoc);
		rootFolder.printInfo("");
	}

}
