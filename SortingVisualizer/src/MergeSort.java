import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class MergeSort {
	public static void merge(int[] arr, int lower, int upper, int outArr[]){
		int mid = (lower+upper) / 2;
		int j = lower;
		int k = mid + 1; // the beginning of the upper half
		int i = lower;
		while(i < upper){
			if (arr[j] < arr[k]){
				outArr[i] = arr[k];
				j++;
				i++;
			}
			else {
				outArr[i] = arr[k];
				k++;
				i++;
			}
			if( i== mid){
				for(int y = k; y < upper; y++){
					outArr[y] = arr[y];
					break;
				}
			}
			if( k == upper){
				for(int y = i; y < mid + 1; y++){
					outArr[y] = arr[y];
					break;
				}
			}
		}
	}
	
	public static void mergeSortHelper(int arr[], int lower, int upper, int[] tmpArr){
		int length = arr.length;
		if (upper <= lower) {
			return;
		} else {
			int mid = lower + (upper - lower) /2;
			mergeSortHelper(arr, lower, mid,tmpArr);
			mergeSortHelper(arr, mid+1, upper, tmpArr);
			merge(arr, lower, mid, tmpArr);
			}
		}
	public static int[] mergeSort(int arr[]){
		int[] tmpArr = new int[arr.length];
		mergeSortHelper(arr, 0, arr.length-1, tmpArr);
		return tmpArr;
	}
	public static void main(String args[]){
		Random rdom = ThreadLocalRandom.current();
		int length = rdom.nextInt(25);
		int[] arrayOne = new int[length];
		for(int i = 0; i < length; i++){
			arrayOne[i] = rdom.nextInt(50);
		}
		System.out.println(Arrays.toString(arrayOne));
		mergeSort(arrayOne);
		System.out.println(Arrays.toString(arrayOne));
	}
	
}
