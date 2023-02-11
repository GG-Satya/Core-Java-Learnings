class Test		// main method overloading is possible
{
	public static void main(String[] args)
	{
	System.out.println("main(String[] args)");

	main();
	main(3);
	
	}
	
	public static void main(){
	System.out.println("main()");
	}

	public static void main(int i){
	System.out.println("main(int i)");
	}
		
}