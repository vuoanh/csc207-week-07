
public class Sorting {
	public static void Sort(int[] arr){
		if (arr == null) {
			throw new IllegalArgumentException();
		}
		int min = 0;
		for (int i = 0; i< arr.length; i++) {
			for (int j = i+1 ; j < arr.length; j++) {
				if (arr[min] < arr[j]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}
}
