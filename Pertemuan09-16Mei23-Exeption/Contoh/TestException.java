import java.util.Scanner;

public class TestException {
    public static void main(String[] args) {

        // Buat objek Scanner
        Scanner input = new Scanner(System.in);
        // Kabari user untuk memasukkan angka sisi persegi
        /*
         * SEBELUM TRY CATCH / EXCEPTION
         */
        // System.out.print("Masukkan sisi persegi: ");
        // double sisi = input.nextDouble();
        // System.out.print("Sisi: " + sisi);

        /*
         * SESUDAH TRY CATCH / EXCEPTION
         */
        try {
            System.out.print("Masukkan sisi persegi: ");
            double sisi = input.nextDouble();
            System.out.print("Sisi: " + sisi);
        } catch (Exception e) {
            System.err.println("Error : Input yang dimasukkan harus berupa angka !");
        }
    }
}