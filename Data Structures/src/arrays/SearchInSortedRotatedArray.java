package arrays;

import java.util.Scanner;

public class SearchInSortedRotatedArray {

	public static void main(String Args[]) {

		int inputArray[] = { 4, 5, 6, 7, 8, 9, 10, 11, 1, 2, 3 };
		int searchElement;
		int SearchPosition;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the search element in the array: ");
		searchElement = scanner.nextInt();
		scanner.close();

		SearchPosition = pivotedBinarySearch(inputArray, inputArray.length, searchElement);

		System.out.println("The position of the search element is : " + SearchPosition + "\nvalue at the pivote is :"
				+ inputArray[SearchPosition]);
	}

	static int pivotedBinarySearch(int inputArray[], int n, int key) {
		int pivot = searchPivote(inputArray, 0, n - 1);

		if (pivot == -1)
			return binarySearch(inputArray, 0, n - 1, key);

		if (inputArray[pivot] == key)
			return pivot;
		if (inputArray[0] <= key)
			return binarySearch(inputArray, 0, pivot - 1, key);
		return binarySearch(inputArray, pivot + 1, n - 1, key);
	}

	static int binarySearch(int inputArray[], int start, int end, int key) {
		if (end < start)
			return -1;

		int mid = (start + end) / 2;
		if (key == inputArray[mid])
			return mid;
		if (key > inputArray[mid])
			return binarySearch(inputArray, (mid + 1), end, key);
		return binarySearch(inputArray, start, (mid - 1), key);
	}

	public static int searchPivote(int inputArray[], int start, int end) {

		if (end < start)
			return -1;
		if (end == start)
			return start;

		int mid = (start + end) / 2;
		if (mid < end && inputArray[mid] > inputArray[mid + 1])
			return mid;
		if (mid > start && inputArray[mid] < inputArray[mid - 1])
			return (mid - 1);
		if (inputArray[start] >= inputArray[mid])
			return searchPivote(inputArray, start, mid - 1);
		return searchPivote(inputArray, mid + 1, end);
	}
}
