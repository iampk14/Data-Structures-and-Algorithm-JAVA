package Patterns;

import java.util.Scanner;

public class pattern10 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		char ch='A';
		for(int i=0; i<n;i++) {
			//char ch='A';
			for(int j =0; j<n;j++) {
				System.out.print(ch);
				ch++;
			}
			
			System.out.println();
		}

	}

}
