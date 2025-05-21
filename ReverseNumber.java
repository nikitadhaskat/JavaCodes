
public class ReverseNumber
{

	public static void main(String[] args) 
	{
	   int num=123;
       int rev=0;
       int copy=num;
         while(num!=0)
         {
    	   copy=num%10;
    	   rev=rev*10+copy;
    	   num=num/10;
   	     }
   	   System.out.println(rev+" reversed number");
     
	}

}
