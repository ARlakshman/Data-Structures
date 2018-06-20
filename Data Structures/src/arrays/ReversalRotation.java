package arrays;

import java.util.Scanner;

public class ReversalRotation {

	public static void main(String[] args) {
		
		int[] inputArray =  {1,2,3,4,5,6,7,8,9};
		int lengthOfArray = inputArray.length;
		
		System.out.println("Enter the number of elements to be rotated in the array: ");
		
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		scanner.close();
		
		rotate(inputArray, number);
		
		System.out.println("The values in the rotated array are");
		
		for(int i=0; i< lengthOfArray; i++ ) {
			System.out.println(inputArray[i]);
		}	
		
	}

	public static void rotate(int ipArray[],int number) {
		int length = ipArray.length;
		reversal(ipArray, 0, number-1);
		reversal(ipArray, number, length-1);
		reversal(ipArray, 0, length-1);
	}
	
	public static void reversal(int ipArray[], int start, int end) {
		while(start<end) {
			int temp = ipArray[start];
			ipArray[start] = ipArray[end];
			ipArray[end] = temp;
			start++;
			end--;
		}
	} 
}