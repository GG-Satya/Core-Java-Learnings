class Student
{
	String Name;
	int  rollNum;
	static int count;
	
	Student(String Name) {
	this.Name=Name;
	count++;
	rollNum=count;
	} 
	
}
class Test3
{
	public static void main(String[] args)
	{
	Student s1=new Student("GG sayta");
	Student s2=new Student("gudu");
	System.out.println(s1.Name+" , "+s1.rollNum);
	System.out.println(s2.Name+" , "+s2.rollNum);
	System.out.println("Total number of Students : "+Student.count);
	}
}