import java.util.Scanner;

class Iklan {
    int kodeIklan;
    String namaIklan; 
    double tarifIklan;

    Scanner scanner = new Scanner(System.in);

    void InputIklan() {
        System.out.print("Kode Iklan : "); this.kodeIklan = scanner.nextInt();
    }
}

public class PasangIklan extends Iklan {
    public int noNota, durasi, jmlIklan;
    double biayaIklan, totBiaya;
    String nama, alamat, cabang;

    public double diskon, ppn;
    public String souvenir;

    Scanner scanner = new Scanner(System.in);

    public PasangIklan(String cabang) {
        this.cabang = cabang;
        System.out.print("Inputkan nama : "); this.nama = scanner.next();
        System.out.print("Inputkan alamat : "); this.alamat = scanner.next();

        super.InputIklan();

        if (super.kodeIklan == 1) {
            super.namaIklan = "Iklan Baris";
            super.tarifIklan = 20000;
        } else if (super.kodeIklan == 2) {
            super.namaIklan = "Iklan Display";
            super.tarifIklan = 25000;
        }
    }

    void setNota() {
        int max = 99999999;
        int min = 10000000;
        int range = max - min + 1;
        this.noNota = (int)(Math.random() * range) + min;
    }

    void inputJumlah() {
        String jenis = "";

        if (super.kodeIklan == 1) {
            jenis = "Jml. Baris";
        } else if (super.kodeIklan == 2) {
            jenis = "Luas (mmk)";
        }

        System.out.print(jenis + " : "); this.jmlIklan = scanner.nextInt();
    }

    double getTarifIklan() {
        return super.tarifIklan;
    }

    void inputDurasi() {
        System.out.print("Inputkan durasi (hari) : "); this.durasi = scanner.nextInt();
    }

    double getDiskon() {
        return this.diskon;
    }

    double getBiayaIklan() {
        double biaya = getTarifIklan() * this.jmlIklan * this.durasi;
        double diskonPrice = (this.diskon / 100) * biaya;

        biaya = biaya - diskonPrice;
        return biaya;
    }

    String getSouvenir() {
        return this.souvenir;
    }

    double getTotal() {
        return getBiayaIklan() + this.ppn;
    }

    void cetak() {
        System.out.println(this.noNota + "  "
            + this.namaIklan + "    "
            + getTarifIklan() + "   "
            + this.jmlIklan + "     "
            + this.durasi + "   "
            + this.ppn + "  "
            + getTotal() + "    "
            + getSouvenir());
    }
}