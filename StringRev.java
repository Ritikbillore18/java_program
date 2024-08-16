// java practice program 
// print reverse of String

class StringRev {
	public static void main(String[] args){
		String str = "hello";
		String rev ="";
		int n = str.length();
		
		for(int i =n-1; i >=0; i-- ){
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
	}
}