
public class Problem5 {
	public static void main(String[] args)
	{
		int a = 2520;
		while(true)
		{
			if( (a%11==0)&&
				(a%12==0)&&
				(a%13==0)&&
				(a%14==0)&&
				(a%15==0)&&
				(a%16==0)&&
				(a%17==0)&&
				(a%18==0)&&
				(a%19==0)&&
				(a%20==0))
			{
				break;
			}
			a += 2520;
		}
		System.out.println(a);
	}

}
