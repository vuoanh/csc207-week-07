import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class MergeSort {
	public static int[] merge(int arrOne[], int arrTwo[]){
		int merged[] = new int[arrOne.length + arrTwo.length];
		int pointerOne = 0;
		int pointerTwo = 0;
		//	while(pointerOne <= arrOne.length-1 || pointerTwo <= arrTwo.length-1){
		for(int i = 0; i < merged.length; i++){
			if(pointerOne >= arrOne.length){
				for(int j = pointerTwo; j < arrTwo.length; j++){
					merged[++i] = arrTwo[pointerTwo];
				}
			}
			if(arrOne[pointerOne] <= arrTwo[pointerTwo]){
				merged[i] = arrOne[pointerOne++];
				
			}
			else{
				merged[i] = arrTwo[pointerTwo++];
			}
		}
		return merged;
	}

	public static void main(String args[]){
		Random rdom = ThreadLocalRandom.current();
		int length = rdom.nextInt(25);
		int[] arrayOne = new int[length];
		for(int i = 0; i < length; i++){
			arrayOne[i] = rdom.nextInt(50);
		}
		System.out.println(Arrays.toString(arrayOne));
		MergeSort(arrayOne);
		System.out.println(Arrays.toString(arrayOne));
	}
	
}
