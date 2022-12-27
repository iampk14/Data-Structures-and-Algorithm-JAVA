package Patterns;

import java.util.Scanner;

public class pattern3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int i=1; int j=1;int k =1;
		while(i<=n) {
			i++;
			j=1;
			while(j<=n) {
				System.out.print(k);
				j++;
				k++;
			}
			System.out.println();
		}

	}

}
