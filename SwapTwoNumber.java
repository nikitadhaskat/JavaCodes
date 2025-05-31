import java.util.Scanner;

public class SwapTwoNumber {

	public static void main(String[] args)
	{
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Before Swapping");
        System.out.println("a=");
        a=sc.nextInt();
        System.out.println("b=");
        b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping");
        System.out.println("a="+a);
        System.out.println("b="+b);



        
	}

}
