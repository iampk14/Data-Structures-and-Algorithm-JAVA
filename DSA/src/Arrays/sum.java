package Arrays;

import java.util.Scanner;

public class sum {
	static int sum(int[] arr,int n) {
		int sum=0;
		for (int i =0; i< n; i++) {
			sum += arr[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr =new int[10000];
		for (int i =0; i< size; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(" Sum of array is : "+ sum(arr, size));
	}

}
