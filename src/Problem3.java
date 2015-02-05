
public class Problem3
{
	public static void main (String[] args)
	{
		long prime = 0;
		long num = 600851475143L;
		for (long i = 3L; i <= num; i += 2)
		{
			if(num%i == 0)
			{
				prime = i;
				num = num/i;
				System.out.println(prime);
			}
		}
	}

}
