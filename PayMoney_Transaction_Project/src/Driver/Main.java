package Driver;
import java.util.Scanner;
import Services.SearchImplementation;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the size of Transaction Array: ");
		int arr_size = scan.nextInt();
		
		int[] arr = new int[arr_size];
		
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < arr_size; i++) {
			if (scan.hasNextInt()) {
				arr[i] = scan.nextInt();
			}
		}
		System.out.println("The elements of the array are: ");
		for (int i = 0; i < arr_size; i++) {
			System.out.println(arr[i] + " ");
		}
		
		System.out.println("Enter the total number of terget that needs to be achieved: ");
		int target_no = scan.nextInt();
		
		while(target_no-- != 0) {
			long target;
			System.out.println("Enter the target: ");
			target = scan.nextLong();
			SearchImplementation searchImplementation = new SearchImplementation();
			searchImplementation.search1(arr, target);
		}
		System.out.println("Program Over without error.");
		scan.close();
	}

}
