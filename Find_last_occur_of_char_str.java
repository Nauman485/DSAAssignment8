package geekster;

public class Find_last_occur_of_char_str {
	public static void main(String []args) {
		String str="abcefgh";
		char ch1='e';
		String s1=Character.toString(ch1);
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			String s=Character.toString(ch);
			if(s.equals(s1)) {
				ch=str.charAt(i+1);
				System.out.println(ch);
			}
		}
	}

}
