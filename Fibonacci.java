import java.math.BigInteger;

public class Fibonacci
{
	int count;
	BigInteger[] values;

	public Fibonacci(int count)
	{
		this.count = count;
		values = new BigInteger[count];
		values[0] = new BigInteger("1");
		values[1] = new BigInteger("1");
	}

	void generate()
	{
		for (int i = 2; i < count; i++)
		{
			values[i] = values[i-1].add(values[i-2]);
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
			Fibonacci f = new Fibonacci(Integer.parseInt(args[0]));
			f.generate();
			f.show();
		} catch (Exception e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
