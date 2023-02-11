class Bike
{
	int i;
	String color;

	Bike(String c) {
	color=c;
	}
}
class Test3
{	
	static void updateColor(Bike args)
	{
		args.color="red";
	}
	public static void main(String[] args)
	{
	Bike b1=new Bike("black");     // black
	System.out.println(b1.color);
	updateColor(b1);
	System.out.println(b1.color);   // red
	}
}