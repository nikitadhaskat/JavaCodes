import java.util.Scanner;

public class LowertoUpper {

	public static void main(String[] args)
	{
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Uppercase Character");
        ch=sc.nextLine().charAt(0);
        ch+=32;
        System.out.println("In lowercase= "+ch);
        
	}

}
