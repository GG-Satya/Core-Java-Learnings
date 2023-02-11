class Vegetable
{
	String color;
	String taste;
	String shape;
	double cost;

	Vegetable(String color,String taste,String shape,double cost)
	{
		this.color=color;
		this.taste=taste;
		this.shape=shape;
		this.cost=cost;
	}

	void VegDetails()
	{
		System.out.println(color);
		System.out.println(taste);
		System.out.println(shape);
		System.out.println(cost);
	}
}
  
class Carrot extends Vegetable
{
	Carrot(String color,String taste,String shape,double cost)
	{
		super(color,taste,shape,cost);
	}
}

class Test
{
	public static void main(String[] args)
	{
		Carrot c1=new Carrot("Red","sweet","Conical",70.5);
		c1.VegDetails();
	}
}