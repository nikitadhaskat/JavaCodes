
public class ArmstrongNumber {

	public static void main(String[] args)
	{
        int n=153;
        int sum=0;
        int copy=n;
        while(n!=0)
        {
        	int rem=n%10;
        	sum+=rem*rem*rem;
        	n=n/10;
        }
        if(sum==copy)
        {
        	System.out.println("Armstrong Number");
        }
        else
        {
        	System.out.println("Not a Armstrong Number");
        }
        
	}

}
