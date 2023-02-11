class Animal
{
	void move() {
	System.out.println("Code for moving with leg");
	}
}

class Dog extends Animal
{

}

class Snake extends Animal
{
	void move() {						// Method overridinng
	System.out.println("Code for Crawling");
	}
}

class Test
{
	public static void main(String[] args)
	{
	Snake s=new Snake();
	s.move();
	Dog d=new Dog();
	d.move();
	}
}

