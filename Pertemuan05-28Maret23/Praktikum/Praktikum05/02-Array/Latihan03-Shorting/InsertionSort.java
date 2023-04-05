public class InsertionSort {
    void shortAsc(int arr[], int n) {
        int i, val, j;
        for (i = 1; i < n; i++) {
            val = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > val) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = val;
        }
    }

    void printArray(int arr[], int n) {
        int i;
        for (i = 0; i < n; i++)
            System.out.println(arr[i] + " ");
    }

}
