class Account
{	
double bal;
}

class Test
{
	public static void main(String[] args)
	{
	Account a1;
	a1=new Account();
	a1.bal= 100.3;
	System.out.println(a1.bal);	
	a1=new Account();
	System.out.println(a1.bal);	
	}
}