class Bike
{
	
}
class KTM extends Bike
{
	
}
class Honda extends Bike
{

}
class Rider 
{
	void ride(Bike b)
	{
		System.out.println("ride(Bike)");
	}
	void ride(KTM k)
	{
		System.out.println("ride(KTM)");
	}
}
class Test
{
	public static void main(String[] args)
	{
		Bike b=new KTM();
		Rider r=new Rider();
		r.ride(b); 
	}
}