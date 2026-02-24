package superkeyword;

class Animal5
{
	void makeSound() {
		System.out.println("Animal makes a sound");
	}
}

class Dog5 extends Animal5
{
	void makeSound()
	{
		super.makeSound();
		{
			System.out.println("Dogs barks");
		}
	}
}

