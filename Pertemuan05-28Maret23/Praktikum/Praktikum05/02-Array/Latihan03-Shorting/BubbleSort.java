import java.util.Arrays;

public class BubbleSort {
    void sortAsc(int arr[]) {
        int n = arr.length, swap;
        System.out.println("Iterasi / Langkah-nya : ");
        for (int i = 0; i < (n - 1); i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                }
                System.out.println(Arrays.toString(arr));
            }

        }
    }

    void prinArray(int arr[]) {
        System.out.println("Hasil (BubbleSort ASC) adalah :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
