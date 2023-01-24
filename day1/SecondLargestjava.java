package week4.day1;

import java.util.Arrays;

public class SecondLargestjava {

	public static void main(String[] args) {
		int[] a =  {3,2,11,4,6,7};
		Arrays.sort(a); 
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("The 2nd largest element is :" +a[4]);			
	}

}


/*
Pseudo Code:
1) Arrange the array in ascending order
2) Pick the 2nd element from the last and print it
*/
