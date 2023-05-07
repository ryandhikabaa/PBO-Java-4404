import java.util.ArrayList;
import java.util.Scanner;

public class GrosirDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Grosir> list = new ArrayList<Grosir>();

        int counter = 1;
        String inputBerhenti = "n", cabang;
        Scanner input = new Scanner(System.in);
        System.out.print("Nama Grosir\t: ");
        cabang = input.next();

        while (true) {
            counter++;

            Grosir grosirku = new Grosir(cabang);
            grosirku.setNota();
            grosirku.inputJumlah();
            grosirku.inputJenis();
            grosirku.getPPN();
            grosirku.getBunga();
            grosirku.getTotalBayar();
            grosirku.getSouvenir();

            list.add(grosirku);
            System.out.print("Lanjut ? (Y/n) : ");
            inputBerhenti = scanner.next();
            if (!inputBerhenti.equalsIgnoreCase("y")) {
                break;
            }
        }

        System.out.println("Grosir Sembako - " + cabang);
        System.out.println("--------------------------------------------------------");
        System.out
                .println(
                        "No     Nota    Kode Produk     Nama Produk      Harga Beli      Harga jual      Jumlah Jual     Total Jual      Ket. Bayar      Lama Tempo      PPN     Bunga       Total Bayar     Souvernir");
        System.out.println("--------------------------------------------------------");

        double totalPPN = 0;
        double totalBiaya = 0;

        for (int i = 0; i < list.size(); i++) {
            System.out.print(i + 1 + " ");
            list.get(i).cetak();

            totalPPN += list.get(i).ppn;
            totalBiaya += list.get(i).totByr;
        }

        System.out.println("--------------------------------------------------------");
        System.out.println("*** Total ***          " + totalPPN + "     " + totalBiaya);
        System.out.println("--------------------------------------------------------");
    }
}
