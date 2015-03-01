import java.util.Arrays;


public class Test
{
	public static void main(String[] args)
	{
		int[] a = new int[5];
		a[0] = 2;
		int[] b = new int[5];
		a[0] = 3;
		System.out.println(Arrays.toString(b));
	}

}
