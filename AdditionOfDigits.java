
public class AdditionOfDigits 
{

	public static void main(String[] args)
	{
       int n=12,sum=0;
       while(n!=0)
       {
    	   sum=sum+n%10;
    	   n=n/10;
       }
       System.out.println("the sum of digit = "+sum);
       
	}

}
