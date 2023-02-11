class Shop
{
	public Veg sell(String name)
	{	
		if(name.equals("Carrot")) return new Carrot();
		if(name.equals("Potato")) return new Potato();
		System.out.println(name+" is Not Available");
		return null;
		
	}
}