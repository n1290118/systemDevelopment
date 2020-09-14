class JavaRenD{
	public static void main(String args[]){
		Hizuke aDay = new Hizuke();
		Hizuke bDay = new Hizuke();
		aDay.setDate(2004, 5, 17);
		bDay.setDate(-1975, 954, -5);
		
		System.out.println("日付１ : " + aDay.getYear() + "/ " + aDay.getMonth() + "/ " + aDay.getDay());
		System.out.println("日付２ : " + bDay.getYear() + "/ " + bDay.getMonth() + "/ " + bDay.getDay());
	}
}
