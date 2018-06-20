package arrays;

import java.util.Scanner;

public class JugglingMethod {

	public static void main(String[] args) {
		
		int[] inputArray =  {1,2,3,4,5,6,7,8,9};
		int lengthOfArray = inputArray.length;
		int noOfSets, d=-1, i,temp,j;
		System.out.println("Enter the number of elements to be rotated in the array: ");
		
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		scanner.close();

		 noOfSets = gcd(lengthOfArray,number);

		 for(i=0; i<noOfSets; i++) {
			
			 j = i;
			 temp = inputArray[i];
			 
			 while(true) {
				 d = (j+number)%lengthOfArray;
				 if(d == i)
					 break;
				 inputArray[j] = inputArray[d];
				 j = d;
			 }
			 
			 inputArray[j] = temp;
		 }
		 
		 System.out.println("The values in the rotated array are");
			
			for(int k=0; k<lengthOfArray; k++ ) {
				System.out.println(inputArray[k]);
			}
	}
	
	public static int gcd(int length, int Rotation){
		
		if(Rotation == 0)
			return length;
		else
			return gcd(Rotation, length%Rotation);
			}
}