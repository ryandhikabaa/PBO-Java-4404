import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<PasangIklan> list = new ArrayList<PasangIklan>();

        int counter = 1;
        String inputBerhenti = "n";

        while(true) {
            counter++;

            PasangIklan pasangIklan = new PasangIklan("cabang A");
            pasangIklan.setNota();
            pasangIklan.inputJumlah();
            pasangIklan.inputDurasi();

            String souvenir;
            if (pasangIklan.durasi >= 3 && pasangIklan.durasi <= 6) {
                pasangIklan.souvenir = "Mug";
            } else if (pasangIklan.durasi >= 7 && pasangIklan.durasi <= 10) {
                pasangIklan.souvenir = "Payung";
            } else if (pasangIklan.durasi >= 11 && pasangIklan.durasi <= 14) {
                pasangIklan.souvenir = "Tas";
            }

            System.out.print("Inputkan diskon % : "); pasangIklan.diskon = scanner.nextInt();

            pasangIklan.ppn = pasangIklan.getBiayaIklan() * 0.1;

            list.add(pasangIklan);

            System.out.print("Lanjut ? (Y/n) : "); inputBerhenti = scanner.next();
            if (!inputBerhenti.equalsIgnoreCase("y")) {
                break;
            }
        }

        System.out.println("Daftar Iklan Cetak - Nama Agen");
        System.out.println("--------------------------------------------------------");
        System.out.println("No  Nota    Produk Iklan    Tarif   Jml/Luas    Durasi  PPN     Total Biaya     Souvenir");
        System.out.println("--------------------------------------------------------");

        double totalPPN = 0;
        double totalBiaya = 0;

        for (int i=0; i < list.size(); i++) {
            System.out.print(i+1 + " "); list.get(i).cetak();

            totalPPN += list.get(i).ppn;
            totalBiaya += list.get(i).getTotal();
        }

        System.out.println("--------------------------------------------------------");
        System.out.println("*** Total ***          " + totalPPN + "     " + totalBiaya);
        System.out.println("--------------------------------------------------------");
    }
}