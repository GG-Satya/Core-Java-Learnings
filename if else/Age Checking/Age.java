import java.util.Scanner;
class Age
{
	public static void main(String[] args)
	{
	System.out.println("Enter your age");
	int age=new Scanner(System.in).nextInt();
	if (age>=28) {
	  if (age <=32) {
    		System.out.println("right age for marriage");
		}else {
		System.out.println("go to himalaya");
			}
	  }else{
	System.out.println("Focous on your career");
		}
	}
}