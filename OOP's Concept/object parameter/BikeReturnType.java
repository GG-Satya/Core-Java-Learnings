class Test4
{
	static Bike getBike()  // getbike() method with object reference return type
 	{
	Bike b1=new Bike("Red");
	return b1;
	}
	
	public static void main(String[] args)
	{
	Bike b2= getBike();
	System.out.println(b2.color);
	}
}