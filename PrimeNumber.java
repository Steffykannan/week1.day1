package Variable;

public class PrimeNumber {
public static void main(String[] args) {
	int a = 13;
	boolean b=false;
	for(int i =2; i<=7;i++ ) {
		int c = a/i;
		c = a%i;
		if (c==0)
			
		{
			b = true ;
			
		break;
		}
	}
		
		if(!b)
		{
			System.out.println("Given number is not a prime number");
		}
		
		else
		{
			System.out.println("Given number is prime number");
		}
			
		
		
	}
}
