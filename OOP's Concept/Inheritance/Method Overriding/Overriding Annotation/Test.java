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
	@Override
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

/* if we make some spelling mistakes while writing overriding method, then code will run
fine & no error will come, java compiler treat that wrong overriding method as a new method
and No overriding takes place. So we use @Override annotation just before writing a Override 
method, so that if developer made any mistakes , java compiler can easily identify that and
throw error.  
	[Error : method does not override or implement a method from a supertype]*/

