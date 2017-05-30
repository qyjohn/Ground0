import java.util.Arrays;

public class Animal
{
	static String[] allowedAnimals = {"Cat", "Dog"};
	String animal, sound;

	public Animal(String sound)
	{
		if (Arrays.asList(allowedAnimals).contains(this.getClass().getName()))
		{
			this.sound = sound;
			System.out.println(this.getClass().getName());
		}
		else
		{
			throw new RuntimeException("Not allowed.");
		}
	}

	static String getAllowedAnimals()
	{
		return Arrays.toString(allowedAnimals);
	}

	String getSound()
	{
		return sound;
	}

	void speak()
	{
		String msg = "The " + animal + " says " + sound + ".";
		System.out.println(msg);
	}
}
