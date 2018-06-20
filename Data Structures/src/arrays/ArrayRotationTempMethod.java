package arrays;

import java.util.Scanner;

public class ArrayRotationTempMethod {

	/* Using temp array */
	
	public static void main(String[] args) {

		int[] input =  {1,2,3,4,5,6,7,8,9};
		int temp[] = new int[9];

		Scanner scanner = new Scanner(System.in);
		
		int number = scanner.nextInt();
		int len = input.length -  number;
		
		System.out.println("Enter the number of elements to be rotated in the array: "+ number);
		
		scanner.close();
		
		for(int i=0; i<number; i++ ) {
			temp[i] = input[i];
		}
		 
		System.out.println("The initiall values are");
		
		for(int i=0; i<= input.length-1; i++ ) {
			System.out.println(input[i]);
		}
		
		for(int i = 0 ; i< input.length - number; i++){
		        input[i] = input[i + number];
		 }
		
		for(int i = 0 ; i<number ; i++){
			input[len] = temp[i];
			len++;
		}
	
		System.out.println("The values in the rotated array are");
		
		for(int i=0; i< input.length; i++ ) {
			System.out.println(input[i]);
		}		
	}	
}