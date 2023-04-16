import java.util.Scanner;

public class SortingDemo {
	public static void main(String[] args) {
		int bykData;
		int ask;
		Sorting obj = new Sorting();
		Scanner input = new Scanner(System.in);

		System.out.print("Masukkan banyaknya data : ");
		bykData = input.nextInt();
		int arr[] = new int[bykData];

		for (int i = 0; i < bykData; i++) {
			System.out.print(" Data ke - " + (i + 1) + " : ");
			arr[i] = input.nextInt();
		}

		obj.tampilData(arr);

		do {
			System.out.println(" ");
			System.out.println(" Menu Sorting : ");
			System.out.println(" 1. BUBBLE SORT ");
			System.out.println(" 2. QUICK SORT ");
			System.out.println(" 3. INSERTION SORT ");
			System.out.println(" 4. SELECTION SORT ");
			System.out.println(" 5. MERGE SORT ");
			System.out.println(" 6. KELUAR ");

			System.out.print(" Masukkan pilihan [1-6] : ");
			ask = input.nextInt();

			int pjgArray = arr.length - 1;

			switch (ask) {
				case 1:
					obj.bubbleSort(arr);
					break;
				case 2:
					System.out.println("QUICK SORT");
					obj.quickSort(arr, 0, pjgArray);
					break;
				case 3:
					obj.insertionSort(arr);
					break;
				case 4:
					obj.selectionSort(arr);
					break;
				case 5:
					System.out.println("MERGE SORT");
					obj.mergeSort(arr, 0, pjgArray);
					break;
				case 6:
					System.out.println("BYE!");

					break;
				default:
					System.out.println("Inputan tidak valid!");
					break;
			}
			System.out.print("ingin mengulangi? [y/t] : ");
			String as = input.next();
			if (as.equalsIgnoreCase("t")) {
				break;
			}
		} while (ask != 0);

	}

}
