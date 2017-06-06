import java.math.BigInteger;

public class FibonacciInt
{
	int count;
	int[] values;

	public FibonacciInt(int count)
	{
		this.count = count;
		values = new int[count];
		values[0] = 1;
		values[1] = 1;
	}

	void generate()
	{
		for (int i = 2; i < count; i++)
		{
			values[i] = values[i-1] + values[i-2];
		}
	}

	void show()
	{
		for (int i = 0; i < count; i++)
		{
			System.out.println(values[i]);
		}
	}

	public static void main(String[] args)
	{
		try
		{
			FibonacciInt f = new FibonacciInt(Integer.parseInt(args[0]));
			f.generate();
			f.show();
		} catch (Exception e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
