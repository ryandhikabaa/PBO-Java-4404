import java.util.Scanner;

public class SortingArray {
    public static void main(String[] args) {
        int iMenu = 0;
        int iJumlahData = 0;
        Scanner input = new Scanner(System.in);
        // object
        BubbleSort bubble = new BubbleSort();
        InsertionSort insertion = new InsertionSort();
        SelectionSort selection = new SelectionSort();
        MergeSort merge = new MergeSort();

        // mengisi data array sesuai size yang diinginkan
        System.out.print("Jumlah data: ");
        iJumlahData = input.nextInt();

        // Deklarasi + set array size
        int[] data = new int[iJumlahData];

        // loop input data
        System.out.println("======== ISI DATA ========");
        for (int i = 0; i < data.length; i++) {
            System.out.print("Data ke - " + (i + 1) + " = ");
            data[i] = input.nextInt();
        }

        do {
            // Menu yang di loop sesuai dengan kondisi pada while
            System.out.println("\n===== Shorting Array =====");
            System.out.println("1. Bubble Sort");
            System.out.println("2. Quick Sort");
            System.out.println("3. Insertsion Sort");
            System.out.println("4. Selection Sort");
            System.out.println("5. Merge Sort");
            System.out.println("6. Keluar");
            System.out.println("==========================");
            System.out.print("Pilih ? ");
            iMenu = input.nextInt();
            System.out.println("--------------------------");
            if (iMenu == 0 || iMenu == 6) {
                break;
            } else if (iMenu == 1) {
                bubble.sortAsc(data);
                bubble.prinArray(data);
            } else if (iMenu == 2) {

            } else if (iMenu == 3) {

            } else if (iMenu == 4) {
                selection.sort(data);
                selection.prinArray(data);
            } else if (iMenu == 5) {
                merge.sort(data, 0, data.length - 1);
                merge.printArray(data);
            }
        } while (iMenu <= 6);
    }
}
