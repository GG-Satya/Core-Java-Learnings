class Person
{
	String name;
	Person(String n) {
	this.name=n;
	}
}

class Docter extends Person      // bcz Docter (is a) Person so Docter can extend Person
{
	String spec;
	Docter(String n,String sp) {
	super(n);
	this.spec=sp;
	}
}

class Test3
{
	public static void main(String[] args)
	{
		Docter d=new Docter("Satya","Cardiologist");
		System.out.println(d.name+"....."+d.spec);
	}
}