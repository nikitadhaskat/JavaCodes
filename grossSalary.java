package practiceCodes;

public class grossSalary {

	public static void main(String[] args) 
	{
        int salary=10000;
        if(salary<=10000)
        {
        	System.out.println("HRA=20%");
        	System.out.println("DA=80%");
        }
        else if(salary<=20000)
        {
        	System.out.println("HRA=25%");
        	System.out.println("DA=90%");
        }
        else if(salary>20000)
        {
        	System.out.println("HRA=30%");
            System.out.println("DA=95%");
        }
	}

}
