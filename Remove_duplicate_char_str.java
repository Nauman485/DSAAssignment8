package geekster;

public class Remove_duplicate_char_str {
	public static void main(String []args) {
		String str="adaabbddgggee";
		String str1="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			String s=Character.toString(ch);
			if(!str1.contains(s)) {
				str1=str1+s;
			}
		}
		System.out.println(str1);
	}

}
