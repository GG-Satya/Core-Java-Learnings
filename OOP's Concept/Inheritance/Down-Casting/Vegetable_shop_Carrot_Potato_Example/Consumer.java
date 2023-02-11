class Consumer
{
	public static void main(String[] args)
	{
		Shop s=new Shop();
		Veg v=s.sell("Carrot");
		((Carrot)v).makingHalwa();

		Potato p=(Potato)s.sell("Potato");
		p.makingFries();

	}
}