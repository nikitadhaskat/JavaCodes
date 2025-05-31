import java.util.Scanner;

public class tableOfNumber {

	public static void main(String[] args) 
	{
      int n;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter any number:");
      n=sc.nextInt();
      for(int i=1;i<=10;i++)
      {
    	int m=n*i;
		System.out.println(n + "*" +i+ "=" + m);
      }
	}
    
}
