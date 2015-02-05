
public class Problem2
{
	public static void main (String[] args)
	{
		long fib1 = 1;
		long fib2 = 2;
		long sum = 2;
		long fibNum = 0;
		while (fibNum < 4000000)
		{
			fibNum = fib1 + fib2;
			fib1 = fib2;
			fib2 = fibNum;
			if (fibNum%2 == 0)
			{
				sum += fibNum;
			}
		}
		System.out.println("The sum of the even Fibonacci number is: "+sum);
	}

}
