import java.util.Scanner; 			//biggest prime num
class A
{
	public static void main (String[] args)
	{
	System.out.println("Enter the range");
	int n=new Scanner(System.in).nextInt();
	boolean flag;
		for(int i=n; i>=2; i--) {
		flag=true;
			for(int j=2;j<=(i/2);j++) {
			if(i%j==0) {flag=false; break;}
			}
		if(flag) { System.out.println("Biggest prime num is "+i); break;}
		}
	}
}