package Driver;

import java.util.Scanner;
import Services.Bubble;
import Services.NotesCount;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the size of currency denominations: ");
		int arr_size = scan.nextInt();
		
		int[] notes = new int[arr_size];
		
		System.out.println("Enter the currency denominations value");
		for (int i = 0; i < arr_size; i++) {
			if (scan.hasNextInt()) {
				notes[i] = scan.nextInt();
			}
		}
		System.out.println("Enter the amount you want ot pay: ");
		int amount = scan.nextInt();
		
		Bubble bubble = new Bubble();
		bubble.sort(notes);
		NotesCount notesCount = new NotesCount();
		notesCount.nodeCounter(notes, amount);
		
		System.out.println("Program Over without error.");
		scan.close();
	}

}