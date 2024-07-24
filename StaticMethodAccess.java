// java Static method only access Static methods 

public class StaticMethodAccess {
 //		 int a = 20;   non static variable 
		 static int i = 20;
		static void R(){
	//		System.out.println(a);  not Access non static variable in static method
			System.out.println(i);
			rx();	 // static method access 
		}
	/*	void rx() {
			System.out.println("25");  // non static method not access 
		} */
		static void rx() {
			System.out.println("25");
		}
		public static void main (String[] args){
			R();  // static method call  by without any object  , static method belongs to class 
			
			
		}
		
}