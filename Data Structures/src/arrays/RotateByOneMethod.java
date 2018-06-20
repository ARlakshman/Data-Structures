package arrays;

import java.util.Scanner;

public class RotateByOneMethod {

	public static void main(String[] args) {
		
		int[] input =  {1,2,3,4,5,6,7,8,9};
		int temp;   

		Scanner scanner = new Scanner(System.in);
		
		int number = scanner.nextInt();
		
		System.out.println("Enter the number of elements to be rotated in the array: "+ number);
		
		scanner.close();
		
		System.out.println("The initiall values are");
		
		for(int i=0; i<= input.length-1; i++ ) {
			System.out.println(input[i]);
		}
		
		for(int i=0 ; i<number ;i++) {
			temp = input[0];
			
			for(int j=0 ; j < input.length ;j++) {
				if(!(j==(input.length-1))) {
					input[j] = input[j+1];
				}else {
					input[j] = temp;
				}
			}			
		}	

		System.out.println("The final values are");
		
		for(int i=0; i<= input.length-1; i++ ) {
			System.out.println(input[i]);
		}
	}

}
