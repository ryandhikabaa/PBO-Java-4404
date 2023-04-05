public class QuickSort {
    // untuk memilih element terakhir sebagai pivot
    int partition(int intArray[], int low, int high) {
        int pi = intArray[high];
        int i = (low - 1); // indikasi dan reset i ke index yang lebih kecil
        for (int j = low; j < high; j++) {
            // cek element sesuai index apakah lebih kecil sama dengan pi?
            if (intArray[j] <= pi) {
                i++;
                // jika iya tukar nilai array index i dengan array index j
                int temp = intArray[i];
                intArray[i] = intArray[j];
                intArray[j] = temp;
            }
        }

        // tukar array index i increment dan array index high atau pi
        int temp = intArray[i + 1];
        intArray[i + 1] = intArray[high];
        intArray[high] = temp;

        return i + 1;
    }

    // recursive function untuk pengurutan
    void quick_sort(int intArray[], int low, int high) {
        if (low < high) {
            // partition the array around pi=>partitioning index and return pi
            int pi = partition(intArray, low, high);

            // sort each partition recursively
            quick_sort(intArray, low, pi - 1);
            quick_sort(intArray, pi + 1, high);
        }
    }
}
