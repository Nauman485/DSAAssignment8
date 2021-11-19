package geekster;
import java.util.*;

public class Factorial {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		fact(n);
	}
	public static void fact(int n) {
		if(n==0 || n==1) {
			System.out.println(1);
		}
		int fact=1;
		for(int i=1;i<=n;i++){
		 fact=fact*i;
		}
		System.out.println(fact);
	}

}
