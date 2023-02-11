import java.util.Scanner;
class A
{
	public static void main (String[] args)
	{
	System.out.println("enter two numbers");
	Scanner scn=new Scanner(System.in);
	int a=scn.nextInt();
	int b=scn.nextInt();
	if(a<=0 || b<=0){System.out.println("can't find LCM of 0 or Negative numbers"); return;}
		for (int i=a>b?a:b;true;i++) {
			 if (i%a==0 && i%b==0) {
			 System.out.println("LCM is "+i);
	 		 break;
 			}
		}
	}
}	