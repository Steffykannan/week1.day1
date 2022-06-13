package Variable;

public class Fibonacci {
public static void main(String[] args) {
	int a = 5, b=0, c=1, sum;
	System.out.println(b);
	
	for(int i=1;i<=a;i++)
	{
		sum = b+c; //sum = 0 + 1 = 1
		c = b; //1 = 1
		b = sum; 
		System.out.println(sum);
		
	}
}
}
