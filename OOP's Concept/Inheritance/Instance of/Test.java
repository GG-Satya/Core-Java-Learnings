class Bike
{
}
class KTM extends Bike
{
}
class RE extends Bike
{
}
class KTM390Adv extends KTM
{
}
class Himalayan extends RE
{
}
class Test
{
	public static void main(String[] args)
	{
	Bike b=new KTM390Adv();
	System.out.println(b instanceof KTM);  // true
	}
}

/* Instanceof operator checks the object is belongs to that class or type of it(subclass) */