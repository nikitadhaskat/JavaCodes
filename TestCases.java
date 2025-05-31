import java.util.Scanner;

public class TestCases {

	public static void main(String[] args)
	{
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any character");
		ch=sc.nextLine().charAt(0);
        if(ch>=55 && ch<=90)
        {
        	System.out.println("Capital Alphabet");
        }
        else if(ch>=97 && ch<=122)
        {
        	System.out.println("Small Alphabet");
        }
        else if(ch>=48 && ch<=57)
        {
        	System.out.println("Digit");
        }
        else
        {
        	System.out.println("Special Character");
        }
	}

}
