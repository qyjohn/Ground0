public class Cow extends Animal
{
	public Cow()
	{
		super("muuu");
		this.animal  = "cow";
	}

	void muuu()
	{
		System.out.println("Muuu, muuu.");
	}

	public static void main(String[] args)
	{
		Cow cow = new Cow();
		cow.speak();
	}
}
