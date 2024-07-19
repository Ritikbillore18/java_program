// Java Static variables how to use in memory afficent 

public class StaticMemoryUse
{
	int id ;
	String name;
	 static String company ="BBC";
	
	StaticMemoryUse(int id ,String name) // Create Constructor
	{
		this.id = id;
		this.name = name;
		this.company = company;
	}
	
	public void display()
	{
		System.out.println(id + " " + name + " " +company);
	}
	
	public static void main(String[] args)
	{
		StaticMemoryUse s1 = new StaticMemoryUse(101,"Pankaj");
		s1.display();
		StaticMemoryUse s2 = new StaticMemoryUse(102,"Nikhil");
		s2.display();
	}
	
}