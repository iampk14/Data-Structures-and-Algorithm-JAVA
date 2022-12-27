package Learning_JAVA;

import java.util.Scanner;

public class prime_number {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=2; i<n/2;i++) {
			if(n%i == 0) {
				System.out.println(n+" is not prime");
				break;
			}else if(i==(n/2)-1) {
				System.out.println(n+" is  prime");
			}
		}

	}

}
