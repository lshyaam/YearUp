
public class LoopsLab2 {

	public static void main(String[] args) {
		int[] array1 = new int[] { 40, 60, 80, 100 };
		int[] array2 = new int[] { 40, 20, 80, 100 };
		int[] array3 = new int[] { 40, 60,80,60};
		System.out.println("Searching in array 1....");
		FindNumberInArray(array1, 60);
		System.out.println("Searching in array 2....");
		FindNumberInArray(array2, 60);
		System.out.println("Searching in array 3....");
		FindNumberInArray(array3, 60);
		System.out.println("Finding all occurencess in array 2...");
		FindOccurencesofNumberInArray(array2,60);
	}

	public static void FindNumberInArray(int[] numbers, int searchNumber) {
		if (numbers != null) {
			int foundAtLocation = -1;

			for (int i = 0; i < numbers.length; i++) {
				if (numbers[i] == searchNumber) {
					foundAtLocation = i;
					break;
				}
			}

			if (foundAtLocation >= 0) {
				System.out.println("The number was found at location " + foundAtLocation);
			} else {
				System.out.println("The number was not found in the array");
			}
		}
	}

	public static void FindOccurencesofNumberInArray(int[] numbers, int searchNumber) 
	{
		if (numbers != null) {
			int countOccurences = 0;

			for (int i = 0; i < numbers.length; i++) {
				if (numbers[i] == searchNumber) {
					int ccountOccurences = 0;
				}
			}


System.out.println(searchNumber + " was found " + countOccurences + " time in the array");
			}
		}
	}

