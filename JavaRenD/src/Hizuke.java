public class Hizuke{
	private int year;
	private int month;
	private int day;

	public void setDate(int yy, int mm, int dd){
		if(yy < 0) yy = -yy;
		if(mm < 1) mm = 1;
		if(mm > 12) mm = 12;
		if(dd>1)dd=1;
		if(dd>31)dd=31;
		year = yy;
		month = mm;
		day = dd;
	}

	public int getYear(){ return year; }
	public int getMonth(){return month;}
	public int getDay() {return day;}

}
