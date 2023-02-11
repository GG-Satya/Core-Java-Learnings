import java.util.Scanner;
class Consumer
{
	public static void main(String[] args)
	{
		System.out.print("Vegetable = ");
		Scanner scn=new Scanner(System.in);
		String vn=scn.next();
		Shop shop=new Shop();
		Veg v=shop.sell(vn);
		if(v instanceof Carrot)((Carrot)v).prepareHalwa();
		if(v instanceof Potato)((Potato)v).prepareFries();
	}
}