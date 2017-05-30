public class AnimalTest
{
	public static void main(String[] args)
	{
		System.out.println(Animal.getAllowedAnimals());
    
		Cat cat = new Cat();
		cat.speak();
		cat.miao();
    
		Dog dog = new Dog();
		dog.speak();
		dog.bark();
	}
}
