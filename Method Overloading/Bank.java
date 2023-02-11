class Bank		// example of method over loading
{
	public static void main(String[] args)
	{
	fundtransfer(9876543210l);
	fundtransfer("abcd@okicici");
	fundtransfer("user1","qwert67");
	}

	static void fundtransfer(long paytmnum)
	{
	System.out.println("Amount transfer using paytmnum");
	}

	static void fundtransfer(String UPI)
	{
	System.out.println("Amout transfer using UPI");
	}

	static void fundtransfer(String Username, String Password)
	{
	System.out.println("Amount transfer using Net banking");
	}
}