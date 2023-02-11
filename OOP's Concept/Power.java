class Power
{
	public static void main(String[] args)
	{
	int a=Integer.parseInt(args[0]);
	int b=Integer.parseInt(args[1]);
	
	double p= Math.pow(a,b); // Math.pow always return doouble type 
	
	System.out.println(a+" to the power "+b+" is "+p);
	}
}