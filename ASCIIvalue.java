import java.util.Scanner;

public class ASCIIvalue {

	public static void main(String[] args) 
	{
         char ch;
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter any character");
         ch=sc.nextLine().charAt(0);
         int AsciiValue=ch;
         System.out.println("ASCII value of "+ch+" is "+AsciiValue);
	}

}
