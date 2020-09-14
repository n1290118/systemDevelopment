public abstract class Figure{
	private String name;
	
	public void setName(String name){
		if(name.length() > 6){
			name = name.substring(0,5);
		}
		this.name = name;
	}
	
	public String getName(){
		return( name );
	}
	
	public void printInf(){
		System.out.print("[" + name + "]");
	}
	
	public abstract int calcArea();
}
