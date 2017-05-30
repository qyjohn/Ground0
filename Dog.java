public class Dog extends Animal
{
	public Dog()
	{
		super("voff");
		this.animal  = "dog";
	}

	void bark()
	{
		System.out.println("Voff, voff.");
	}

	public static void main(String[] args)
	{
		Dog dog = new Dog();
		dog.speak();
	}
}
