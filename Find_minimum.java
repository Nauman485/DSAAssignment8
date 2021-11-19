package geekster;

public class Find_minimum {
public static void main(String []args) {
		
		int []a= {3,5,78,45,21,46,53,16};
		int min=Integer.MAX_VALUE;
		
		for(int i=0;i<a.length;i++) {
			if(min>a[i]) {
				min=a[i];
			}
		}
		System.out.println("Minimum = "+min);
	}


}
