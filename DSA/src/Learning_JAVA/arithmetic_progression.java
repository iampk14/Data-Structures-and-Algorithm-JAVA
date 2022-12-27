package Learning_JAVA;

import java.util.Scanner;

public class arithmetic_progression {
	static int ap(int n) {
		
		return  3*n+7;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n =sc.nextInt();
		System.out.print(ap(n));
	}

}
