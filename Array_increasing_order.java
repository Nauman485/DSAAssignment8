package geekster;

public class Array_increasing_order {
	public static void main(String []args) {
		int arr[]= {1,2,5,7,8,9};
		boolean flag=false;
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]<arr[i+1]) {
				flag=true;
			}
			else {
				flag=false;
			}
		}
		if(flag==true) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}

}
