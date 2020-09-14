
public class File extends Node {
	private int size;

	public File(String name,int size) {
		this.name=name;
		this.size=size;
	}
	@Override
	public void printInfo(String prefix) {
		System.out.println(prefix + name + "\t" + getSize() + " byte.");
	}

	@Override
	public int getSize() {
		return size;
	}

}
