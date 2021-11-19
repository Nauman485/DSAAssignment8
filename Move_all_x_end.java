package geekster;

public class Move_all_x_end {
	public static void main(String []args) {
		String str="Abxyfxyxexyy";
		char ch1='x';
		String str1="", str2="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			String s=Character.toString(ch);
			if(ch==ch1) {
				str1=str1+s;
			}
			else {
				str2=str2+s;
			}
		}
		System.out.println(str2+str1);
	}

}
