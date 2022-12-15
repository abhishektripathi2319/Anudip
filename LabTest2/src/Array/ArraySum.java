package Array;

public class ArraySum {
	public static int sumOfArrayElements(int[] arr) {
		int sum = 0;
		for(int i:arr) {
			sum = sum + i;
		}
		return sum;
	}
	public static void main(String[] args) {
		// array1 initialization
		int[] array1 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

		// Calculate the array2 length
		int len = array1.length / 2;
		// array2 declaration

		int[] array2 = new int[len];

		// insert alternate items of array1 into array2
		int index2 = 0;
		boolean flag = true;
		for (int i = 0; i < array1.length; i++) {
			if (flag == true) {
				array2[index2] = array1[i];
				flag = false;
				index2++;
			}else {
				flag=true;
			}
		}
		
		// Print array2 and also calculate sum of element of Array2
		System.out.print("Array2 elements: ");
		for(int i:array2) {
			System.out.print(i+" ");
		}
		//Now call sumOfArrayElements(int arr[]) to find the sum
		int sum = sumOfArrayElements(array2);
		System.out.println("\nSum of elements : "+sum);
		
		

	}

}
