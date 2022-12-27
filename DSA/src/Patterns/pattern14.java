package Patterns;

import java.util.Scanner;

public class pattern14 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		while(i<=n) {
			int j=1;
			int space=j;
			int count=1;
			while(j<=n-i+1) {
				System.out.print(count++);
				j++;
			}
			int k=1;
			while(j<=i) {
				
				System.out.print("*");
				j++;
			}
//			int start =i-1;
//			while(start!=0) {
//				System.out.print(start);
//				start--;
//			}
			System.out.println();
			i++;
		}

	}

}
