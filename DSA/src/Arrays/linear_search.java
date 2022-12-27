package Arrays;

import java.util.Scanner;

public class linear_search {
	
	static boolean search(int[] arr, int size, int key) {
		for (int i=0; i< size; i++) {
			if(arr[i] == key) return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int key = sc.nextInt();
		int[] arr = {5, 7, -2, 10, 22, -2, 0, 5, 22, 1};
		boolean b =search(arr, arr.length, key);
		if(b) System.out.println("Key is present");
		else System.out.println("Key is not present");
	}

}
