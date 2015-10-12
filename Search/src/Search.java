 
public class Search {
	
 public static int linearSearch(int[] numbers, int searched){
	 for(int j = 0; j < numbers.length; j++){
		 if(numbers[j] == searched){
			 return j;
		 }
	 }
	 throw new IllegalArgumentException();
 }
 
 public static int binarySearch(int[] numbers, int searched, int low, int high){
	int mid = (low + high)/2;
	if(low >= high){
		throw new IllegalArgumentException();
	}
	if(numbers[mid] == searched){
		return mid;
	}
	else if(searched < numbers[mid]){
		return binarySearch(numbers, searched, low, mid-1);
	}
	else{
		return binarySearch(numbers, searched, mid+1, high);
	}
 }
}

