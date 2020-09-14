
public class Folder extends Node{
	private int childCnt = 0;
	private Node childs[]=new Node[10];

	public Folder(String name) {
		this.name=name;
	}
	@Override
	public void printInfo(String prefix) {
		System.out.println(prefix + "+" + name);
		for(int i = 0;i < childCnt;i++){
			childs[i].printInfo("   " + prefix);
		}
	}
	public void addChild(Node ch){
		childs[childCnt]=ch;
		childCnt++;

	}
	@Override
	public int getSize() {

		return 0;
	}

}
