import java.util.*;

public class TwoDArray{

 public static void main(String[] args){
 
 Scanner in = new Scanner(System.in);
	//intialise two D Array 
	int[][] arr = new int[3][3]; 


        // 2nd way to initialise 2d array
	int[][] arr1 = {
			{1,2,3,4},
			{6,7,8},
			{9,10,11}
     	  	       };
    // System.out.println(arr1[2]);
   // print this array 
 
	for(int row=0;row<arr1.length;row++){
   		for(int col=0; col<arr1[row].length; col++){
			System.out.print(arr1[row][col]+ " " );
		}
		System.out.println();
 	}

	System.out.println();


// user input 
    for(int row=0; row<arr.length; row++){
    	for(int col=0; col<arr[row].length; col++){
		arr[row][col] = in.nextInt();	     
	}
      }
 // output 
   /* for(int row=0; row<arr.length; row++){
    	for(int col=0; col<arr[row].length; col++){
		System.out.print(arr[row][col]+" ");
	}
System.out.println();
      }*/


System.out.println();

    // Another way to print Array 
for(int row=0;row<arr.length;row++){
System.out.println(Arrays.toString(arr[row]));
 }


System.out.println();


// for each loop 
   for(int[] a:arr){
   System.out.println(Arrays.toString(a));
}

}
}