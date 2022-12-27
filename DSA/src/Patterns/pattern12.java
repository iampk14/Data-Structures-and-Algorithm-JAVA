package Patterns;

import java.util.Scanner;

public class pattern12 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		while(row<=n) {
			int col=1;
			int space=n-row;
			while(col<=n) {
				if(space<col) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				col++;
			}
			row++;
			System.out.println();
		}

	}

}
