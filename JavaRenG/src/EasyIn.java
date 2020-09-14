import java.io.*;

public class EasyIn{
	private static BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));

	public static String readString() throws IOException{
		return(bin.readLine());
	}

	public static String[] readString(char c) throws IOException{
		String ret[];
		int idx;
		int i, cnt = 0;
		String str = bin.readLine();
		for(i = 0; i < str.length(); i++){
			if(str.charAt(i) == c){
				cnt++;
			}
		}
		ret = new String[cnt+1];
		idx = str.indexOf(c);
		for(i = 0; idx != -1; i++){
			ret[i] = str.substring(0,idx);
			str = str.substring(idx+1, str.length());
			idx = str.indexOf(c);
		}
		ret[i] = str;
		return ret;
	}

	public static int readInt() throws IOException{
		int ret;
		ret = Integer.parseInt( bin.readLine() );
		return ret ;
	}

	public static int[] readInt(char c) throws IOException{
		int i;
		String str[] = readString(c);
		int ret[] = new int[str.length];
		for(i = 0; i < str.length; i++){
			ret[i] = Integer.parseInt(str[i]);
		}
		return ret;
	}
}
