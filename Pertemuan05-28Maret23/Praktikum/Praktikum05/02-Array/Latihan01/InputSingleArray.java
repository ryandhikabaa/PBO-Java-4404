import java.util.Scanner;

public class InputSingleArray {
    public static void main(String[] args) {

        int iJumlahData;

        Scanner input = new Scanner(System.in);

        System.out.print("Jumlah data: ");
        iJumlahData = input.nextInt();

        // Deklarasi + set array size
        int[] data = new int[iJumlahData];

        // loop input data
        for (int i = 0; i < data.length; i++) {
            System.out.print("Data ke - " + (i + 1) + " = ");
            data[i] = input.nextInt();
        }

        // loop hasil inputan
        for (int i = 0; i < data.length; i++) {
            System.out.println("Hasil nilai[" + i + "] = " + data[i]);
        }

    }
}
