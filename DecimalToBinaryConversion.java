import java.util.Scanner;

public class DecimalToBinaryConversion {

	public static void main(String[] args) 
	{
          int num;
          int bit=8;
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter a decimal number");
          num=sc.nextInt();
          while(bit>=0)
          {
        	  if((num &(1<<bit))!=0)
        	  { 
        		  System.out.print("1");
        	  }
        	  else
        	  {
        		  System.out.print("0");
        	  }
        	  bit--;
          }
	}

}
