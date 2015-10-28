
public class SelectionSort {
	public static int[] SelectionSort(int[] arr) {
		return SelectionSortHelper(arr, 0, arr.length);
	}
	
	public static int[] SelectionSortHelper(int[] arr, int low, int high){
		if (low == high){
		return arr;
		} else {
			int min = arr[low];
			int minInd = low;
			for (int i = low + 1; i < high; i++) {
				if (arr[i] < min) {
					min = arr[i];
					minInd = i;
				}
			}
			QuickSort.swap(arr, minInd, low);
			SelectionSortHelper(arr, low + 1, high);
			return arr;
		}
	}
}
