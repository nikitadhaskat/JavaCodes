import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args)
	{
          String str=" ";
          String reversed=" ";
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter any string");
          str=sc.nextLine();
          for(int i=str.length()-1;i>=0;i--)
          {
        	  reversed=reversed+str.charAt(i);
          }
          System.out.println("Reversed string is "+reversed);
	}

}
