package Learning_JAVA;

import java.util.Scanner;

public class Identify_character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		char m =sc.next().charAt(0);
		
		if(m >= 'a' & m <= 'z') {
			System.out.println(m+" is lowercase");
		}else if(m >= 'A' & m <= 'Z') {
			System.out.println(m+" is Uppercase");
		}else if(m >= '0' & m <= '9') {
			System.out.println(m+" is number");
	}
	}

}
