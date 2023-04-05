import java.util.Arrays;

public class SelectionSort {
    public static void sort(int[] a)
    // Sort the contents of array a in ascending numerical order
    {
        for (int i = 0; i < a.length - 1; i++) {
            int temp, pos = i;
            for (int j = i + 1; j < a.length; j++)
                if (a[j] < a[pos])
                    pos = j;
            temp = a[i];
            a[i] = a[pos];
            a[pos] = temp;
            System.out.println(Arrays.toString(a));
        }
    }

    void prinArray(int arr[]) {
        System.out.println("Hasil (SelectionSort ASC) adalah :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
