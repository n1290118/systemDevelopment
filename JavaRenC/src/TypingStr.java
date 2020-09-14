import java.util.Calendar;

public class TypingStr {
	String typeStr;
	long elapsed;

	void start(){
		elapsed = Calendar.getInstance().getTimeInMillis();
	}

	boolean check(String input){
		if(typeStr.equals(input)){
			elapsed = Calendar.getInstance().getTimeInMillis() -elapsed;
			return true;
		}
		else{
			return false;
		}
	}

	void dispResult(){
		String spaceStr = "             ";	//半角空白13文字
		int typeLen = typeStr.length();		//↓問題と空白合わせて必ず13文字出力
		System.out.print(typeStr + spaceStr.substring(typeLen));
		System.out.println(": " + elapsed + "ms");
	}
}
