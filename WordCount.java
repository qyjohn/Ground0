import java.io.*;
import java.util.*;

public class WordCount
{
	String filename;
	TreeMap<String, Integer> words;
	
	public WordCount(String filename)
	{
		this.filename = filename;
		words = new TreeMap<String, Integer>();
	}

	void count()
	{
		try
		{
			String line = null;
			BufferedReader br = new BufferedReader(new FileReader(new File(filename)));
			while ((line = br.readLine()) != null)
			{
				StringTokenizer st = new StringTokenizer(line, "`~!@#$%^&*()_+-=[]{};:'|,./<>?\\ \t\"");
				while (st.hasMoreTokens())
				{
					String word = st.nextToken();
					Integer count;
					if ((count = words.get(word)) != null)	// existing word
					{
						words.put(word, new Integer(count.intValue() + 1));	
					}
					else	// new word
					{
						words.put(word, new Integer(1));
					}
				}
			}

		} catch (Exception e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	void show()
	{
		for (String key: words.keySet())
		{
			System.out.println(key + "\t" + words.get(key));
		}
	}

	public static void main(String[] args)
	{
		try
		{
			WordCount wc = new WordCount(args[0]);
			wc.count();
			wc.show();
		} catch (Exception e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
