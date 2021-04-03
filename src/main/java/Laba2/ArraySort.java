package Laba2;

public class ArraySort {
public static int[] Sort(int [] array) {
		
		boolean isSorted = false;
		int trnsf;
		while (!isSorted) {
			isSorted=true;
			for (int i =0; i < array.length-1; i++) {
				if (array[i] > array[i+1]) {
					isSorted=false;
					
					trnsf = array[i];
					array[i]=array[i+1];
					array[i+1]=trnsf;
				} 
				
			}
			
			
		}
		
		return array;
		
	}
}
