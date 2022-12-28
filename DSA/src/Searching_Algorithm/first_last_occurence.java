package Searching_Algorithm;

import java.util.ArrayList;
import java.util.Scanner;

// Using Binary Search
//https://www.codingninjas.com/codestudio/problems/first-and-last-position-of-an-element-in-sorted-array_1082549?source=youtube&campaign=love_babbar_codestudio2&utm_source=youtube&utm_medium=affiliate&utm_campaign=love_babbar_codestudio2
// Test Cases
// ----------------------
//Test Case 1
//2
//6 3
//0 5 5 6 6 6
//8 2
//0 0 1 1 2 2 2 2
//-----------------------
//Test Case 2
//2
//4 0
//0 0 0 0
//1 2
//2
public class first_last_occurence {
	static int FirstOccurence(int[] arr, int n,int key ){
		int start=0, end= n-1;
		int mid =start + (end-start)/2;
		int ans=-1;		
		while(start<=end){
			if(arr[mid] == key){
				ans =mid;
				end=mid-1;
			}else if(key>arr[mid]){
				start =mid+1;
			}else if(key< arr[mid]){
				end=mid-1;
			}
			mid =start + (end-start)/2;

		}
		return ans;
	}
	static int LastOcc(int[] arr, int n,int key ){
		int start=0, end= n-1;
		int mid =start + (end-start)/2;
		int ans=-1;
		while(start<=end){
			if(arr[mid] == key){
				ans =mid;
				start=mid+1;
			}else if(key>arr[mid]){
				start =mid+1;
			}else if(key< arr[mid]){
				end=mid-1;
			}
			mid =start + (end-start)/2;

		}
		return ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int test_case =sc.nextInt();
		while(test_case!=0) {
			int n =sc.nextInt();
			System.out.println(n);
			int k= sc.nextInt();
			int[] arr = new int[n];
			for (int i=0; i<n; i++) {
				arr[i]=sc.nextInt();
			}
			System.out.println(FirstOccurence(arr, n, k)+" "+LastOcc(arr,n,k));
			test_case--;
			System.out.println(test_case);
		}
		

	}

}
