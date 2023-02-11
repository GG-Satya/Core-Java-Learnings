class J
{
	public static void main (String[] args)
	{
	int a=30;
	int b=5;
//signed right shift :

	System.out.println(a>>b);               //signed right shift , Integers sign does not changes after signed right shift

	System.out.println(b%32+"  times bits shift rightside");              // if we write a>>n, then it is a>>(n%size of a datatype)

//unsigned right shift : 

a=-25;
b= a>>>2;

	System.out.println(b); // output is always +ve as it always fills zero in MSB
	}
}