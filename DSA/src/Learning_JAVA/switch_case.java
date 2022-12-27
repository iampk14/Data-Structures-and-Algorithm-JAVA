package Learning_JAVA;

import java.util.Scanner;

public class switch_case {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x = 1339;//type your desired number
        int n = 1;
        switch (n){
            case 1:
                int ans = x/100;
                System.out.println("Number of 100's are : "+ ans);
                x-=ans*100;
                n++;
                if(x==0)break;
            case 2:
                ans = x/50;
                System.out.println("Number of 50's are : "+ ans);
                x-=ans*50;
                n++;
                if(x==0)break;
            case 3:
                ans = x/20;
                System.out.println("Number of 20's are : "+ ans);
                x-=ans*20;
                n++;
                if(x==0)break;
            case 4:
                System.out.println("Number of 1's are : "+ x);
                x = 0;
                if(x==0)break;
            default:
                System.out.println("Some error occured");
        }
		
	}

}
