// static block in java 

public class StaticBlockEx{
	static {
		System.out.println("Hello");   // static block is loaded when class is loaded
	}
	
	public static void main(String[] args){
		System.out.println("Hello World , I am in Main Method");
	}
	
	// in one class many static blocks is occurs 
	
	static {
		System.out.println("Hello 2");
	}
}   // output of staric blocks is sequencly than last me exceute main method