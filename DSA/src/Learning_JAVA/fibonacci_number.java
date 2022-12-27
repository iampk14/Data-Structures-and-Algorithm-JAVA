package Learning_JAVA;

import java.util.Scanner;

public class fibonacci_number {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
 		int m = sc.nextInt();
 		int a =0;
 		int b=1;
 		System.out.print(a+" "+b);
 		for (int i=1; i<=m;i++) {
 			int nn=a+b;
 			System.out.print(" "+nn);
 			a=b;
 			b=nn;
 		}
	}

}
