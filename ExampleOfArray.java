import java.util.*;
public class ExampleOfArray{
 public static void main (String[] args){

   Scanner in = new Scanner(System.in);   

     int[] arr = new int[5];
     
     int[] arr1 = {1,2,3,4,5,6};
     System.out.println(arr[2]);
     System.out.println(arr1[4]);
     System.out.println(arr[0]);
 
    String[] str1 = {"ritik","billore","kartik","aryan","vevek","oberoye"};
     System.out.println(str1[4]);
     System.out.println(str1[0]);

  //  user input of an array
    String[] str = new String[7];
	for(int i=0; i<str.length ; i++){
          str[i] = in.next();    
    }

/* 	for(int i=0; i<str.length; i++){
        System.out.print(str[i] + " ");
   } */
   
   System.out.println(Arrays.toString(str));
 
   
}
}