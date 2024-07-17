// java Static variable 

public class StaticVariableEX
{
	 static int a = 10; // static keyword only use in the InstanceVariable
	 
	 /*public void test()
	{
			int b = 10;      // Static keyword local variable ke aage nhi lag sakta 
	}*/
}	
	class Demo
	{
		 public static void main(String[] args)
		 {
			 System.out.println(StaticVariableEX.a); // Variable Class ke name se bhi run ho jata hai 
		 }
	}