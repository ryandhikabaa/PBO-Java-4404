import java.util.Scanner;

public class TestException {
    public static void main(String[] args) {
        // Buat objek Scanner
        Scanner input = new Scanner(System.in);
        // Kabari user untuk memasukkan angka sisi persegi
        System.out.print("Masukkan sisi persegi: ");
        double sisi = input.nextDouble();
        System.out.print("Sisi: " + sisi);
    }
}