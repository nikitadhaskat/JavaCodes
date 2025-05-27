package practiceCodes;

public class numberOfNotes {

	public static void main(String[] args) 
	{
       int amount=2700;
       int currency;
       if(amount>=2000)
       {
    	   currency=amount/2000;
    	   System.out.println(2000*currency);
    	   amount=amount%2000;
       }
       else if(amount>=500)
       {
    	   currency=amount/500;
    	   System.out.println(500*currency);
    	   amount=amount%500;
       }
       else if(amount>=200)
       {
    	   currency=amount/200;
    	   System.out.println(200*currency);
    	   amount=amount%200;
       }
       else if(amount>=100)
       {
    	   currency=amount/100;
    	   System.out.println(100*currency);
    	   amount=amount%100;
       }
       else if(amount>=50)
       {
    	   currency=amount/50;
    	   System.out.println(50*currency);
    	   amount=amount%50;
       }
       else if(amount>=20)
       {
    	   currency=amount/20;
    	   System.out.println(20*currency);
    	   amount=amount%20;
       }
       else if(amount>=10)
       {
    	   currency=amount/10;
    	   System.out.println(10*currency);
    	   amount=amount%10;
       }



       
       
	}

}
