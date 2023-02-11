import java.util.Scanner;
class A
{
	public static void main (String[] args)
	{
	Scanner scn=new Scanner(System.in);
	int x=scn.nextInt();
	int count=0;
	    for(int i=1;x>i;++i) {
		 for(int j=1;i>=j;++j) {
	           if(x%i==0) {
		     ++count;
		     }
	     	 }
                 if(count==2) {
                   System.out.println(i);
			}
	    } 
	 }
		
}
	