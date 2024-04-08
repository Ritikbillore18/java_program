// Find maximum value of an array

public class MaxValue {
	public static void main(String[] args){
	int[] arr = {12,13,40,45,48};

	System.out.println(max(arr));
	System.out.println(maxRange(arr ,2,4));
	}
	
	static int max(int[] arr){
	int maxvalue = arr[0];
	for(int i=0 ;i< arr.length ;i++){
		if(maxvalue < arr[i]){
			maxvalue = arr[i];
		}
	} return maxvalue;
	}

	// to find max value in Range

	static int maxRange(int[] arr,int start,int end){
	int maxvalue = arr[start];
	for(int i=start;i< end;i++){
		if(maxvalue < arr[i]){
			maxvalue = arr[i];
		}
	} return maxvalue;


	}
}