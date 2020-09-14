class Address{
	String name;	// 氏名
	String address;	// 住所

	boolean match(String nm){
		int len;
		if(nm.length() < name.length()){
			len = nm.length();
		}
		else{
			return false;
		}

		String w;
		w = name.substring(0, len);

		if(w.equals(nm)){
			return true;
		}
		else{
			return false;
		}
	}
}
