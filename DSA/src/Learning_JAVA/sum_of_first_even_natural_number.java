package Learning_JAVA;

import java.util.Scanner;

public class sum_of_first_even_natural_number {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for(int i=0;i<n;i=i+2) {
			sum=sum+i;
		}
System.out.println("Sum is "+sum);
	}

}
