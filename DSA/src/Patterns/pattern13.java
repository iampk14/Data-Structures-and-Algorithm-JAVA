package Patterns;

import java.util.Scanner;

public class pattern13 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		while(i<=n) {
			int j=1;
			int space=n-i;
			while(space !=0) {
				System.out.print(" ");
				space--;
			}
			
			while(j<=i) {
				
				System.out.print(j);
				j++;
			}
			int start =i-1;
			while(start!=0) {
				System.out.print(start);
				start--;
			}
			System.out.println();
			i++;
		}

	}

}
