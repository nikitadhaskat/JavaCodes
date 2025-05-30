

import java.util.Scanner;

public class CountOfDigit {

	public static void main(String[] args) 
	{
        int n,digit;
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        n=sc.nextInt();
        System.out.println("Enter any digit");
        digit=sc.nextInt();
        while(n!=0)
        {
           if(n%10==digit)
           {
        	   count++;
           }
           n=n/10;
        }
        System.out.println("count= "+count);
        
        
	}

}
