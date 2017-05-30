public class Cat extends Animal
{
	public Cat()
	{
		super("miao");
		this.animal  = "cat";
	}

	void miao()
	{
		System.out.println("Miao, miao.");
	}

	public static void main(String[] args)
	{
		Cat cat = new Cat();
		cat.speak();
	}
}
