package Arrays;

import java.util.Scanner;

public class reverse_array {
//	static void reverse(int [] arr,int n) {
//		int temp=0;
//		for (int i=0; i<n/2; i++) {
//			temp=arr[i];
//			arr[i]= arr[n-1-i];
//			arr[n-1-i]=temp;
//			
//		}
//		for (int num:arr) {
//			System.out.print(num);
//		

//	}
//	public static void main(String[] args) {
//		Scanner sc =new Scanner(System.in);
//		
//		int[] arr = {1, 2, 3, 4, 5};
//		reverse(arr, arr.length);
//
//	}
	public static boolean canBeIncreasing(int[] nums) {
	int[] arr =new int[nums.length-1];
    arr[nums.length-2]=nums[nums.length-1];
    int[] arr2 =new int[nums.length-1];
    arr2[nums.length-2]=nums[nums.length-1];
    int b=1, count=0;
    boolean ans=true;
    for (int i=0; i<nums.length-1; i++){
        if(nums[i]>=nums[i+1] && b==1){
            b=0;
            arr[i]=nums[i+1];
            arr2[i]=nums[i];
            continue;
        }
        if(b==1) {
        arr[i]=nums[i];
        arr2[i]=nums[i];
        }
        else {
        	arr[i]=nums[i+1];
            arr2[i]=nums[i+1];
        }
    }
   
   // boolean ans = true;
    for (int i=0; i<arr.length-1; i++){
        if(arr[i]>=arr[i+1]){
           ans =false;
        }
    }
    boolean ans2=true;
    for (int i=0; i<arr2.length-1; i++){
        if(arr2[i]>=arr2[i+1]){
           ans2 =false;
        }
    }
    if (ans==false && ans2==false) {
    	return false;
    }
    return true;
}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int[] arr = {105,924,32,968};
//		for(int i=0;i<arr.length; i++) {
//        	System.out.print(" "+arr[i]);
//        }
		System.out.print(canBeIncreasing(arr));
		
	}
}
