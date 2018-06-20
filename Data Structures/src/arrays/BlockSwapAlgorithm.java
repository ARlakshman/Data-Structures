package arrays;

import java.util.Scanner;

public class BlockSwapAlgorithm {
	public static void main(String[] args) {

		int inputArray[] = { 1, 2, 3, 4, 5, 6, 7, 8 };

		System.out.println("Enter the Number of Positions to be rotated: ");

		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		scanner.close();

		block(inputArray,inputArray.length,number);
		printArray(inputArray);
	}
	
	public static void block(int array[], int length, int number) {
		
		if (number == 0 || number == length) { 	
			return;
		}
		
		int A, B;
		  if(number == 0 || number == length)
		    return;
		  A = number;
		  B = length - number;
		  while (A != B)
		  {
		    if(A < B) 
		    {
		      swap(array, number-A, number+B-A, A);
		      B -= A;
		    }
		    else 
		    {
		      swap(array, number-A, number, B);
		      A -= B;
		    }
		  }
		  swap(array, number-A, number, A);
		
	}
	
	public static void printArray(int array[]) {

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	public static void swap(int array[], int start, int end, int number) {

		int temp;
		for (int i = 0; i < number; i++) {
			temp = array[start+i];
			array[start+i] = array[end + i];
			array[end + i] = temp;
		}
	}

}
