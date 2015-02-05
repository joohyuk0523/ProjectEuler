
public class Problem4 {
	public boolean isPalindrome(String s)
	{
		if (s.length()%2 != 0)
		{
			s = s.substring( 0, s.length() / 2) + s.substring((s.length()/2)+1);
		}
		return new StringBuffer(s.substring(0, s.length()/2)).reverse().toString().equals(s.substring(s.length()/2));
	}
	public static void main(String[] args)
	{
		Problem4 s = new Problem4();
		long largest = 0;
		for(int i = 999; i > 0; i--)
		{
			for(int k = 999; k > 0; k--)
			{
				if(s.isPalindrome(new Long(i*k).toString()))
				{
					if(i*k > largest)
					{
						largest = i*k;
					}
				}
			}
		}
		System.out.println(largest);
	}
}
