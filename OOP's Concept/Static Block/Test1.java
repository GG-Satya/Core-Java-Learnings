class Test1
{
	static
	{
		main(null);
	}

	public static void main(String[] args)
	{
		System.out.println("main method Executing");  
	}
}

/*  main method will be executed twice 
	--> 1st, at the time of class loading all static block are executed, so if we call 
main method inside a static block by passing an argument, then the main method will execute.

	--> 2nd, when class Loading overs, autoamtically main method is executed.    */