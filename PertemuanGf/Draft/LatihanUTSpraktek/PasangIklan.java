// Iklan Cetak - <Nama Agen>

// No. Nota 	: <proses>
// Nama Pemasang	: <input>
// Alamat		: <input>
// Kode Produk	: <input>	1. Iklas Baris		2. Iklan Display
// Produk Iklan	: <proses>

// Tarif Iklan	: <proses>	1. Rp. 20.000/baris	2. Rp. 25.000/mmk	

// Jika 1 :
// Jml. Baris	: <input>

// Jika 2 :
// Luas (mmk)	: <input>

// Durasi (hari)	: <input>
// Diskon (%)	: <input>	
// Biaya Iklan	: <proses>	Tarif * jmlbaris/Luas * durasi - diskon

// PPN		: <proses>	10% dr biaya iklan
// Total Biaya	: <proses>
// Souvenir	: <proses>	

// Ketentuan :
// - Souvernir di dapat Jika jenis iklan display :
//   durasi 3 - 6 		= Mug
//   durasi 7 - 10	 	= Payung
//   durasi 11 - 14	= Tas

// - Buat class Iklan
//   atribut : kodeIklan, nmIklan, tarifIklan
//   Method  : inputIklan()

// - Buat class PasangIklan turunan dari Iklan
//   atribut : noNota, nama, alamat,jmlIklan, durasi, diskon, biayaIklan,ppn,totBiaya,souvenir
//   Method  : PasangIklan(String cabang),setNota(),inputJumlah(),getTarifIklan(),inputDurasi(),
// 	    getDiskon(),getBiayaIklan(), getSouvenir(),getTotal(),cetak()
// - Buat Array Obyek, cetak dalam bentuk tabular.

//   Daftar Iklan Cetak <Nama Agen>
//   -----------------------------------------------------------------------------------
//   No  Nota     Produk Iklan Tarif      Jml/Luas  Durasi  PPN 	 Total Biaya Souvenir
//   -----------------------------------------------------------------------------------
//   1.  999999   xxxxxxxxxxx  999999999  99999  	   999   9999999 9999999999  xxxxxxx
//   2.  999999   xxxxxxxxxxx  999999999  99999  	   999   9999999 9999999999  xxxxxxx
//   dst
//   -----------------------------------------------------------------------------------
// 					***Total***      9999999 9999999999			
//   -----------------------------------------------------------------------------------

// Ket :
// Nilai diperoleh :
// waktu < 1 jam		= A
// waktu 1.01 - 1.15 jam	= AB
// waktu 1.16 - 1.30	= B
// lainnya			= C-BC

//buatkan programnya
import java.util.Scanner;
class PasangIklan extends Iklan {
    public static int length;
    int noNota, jmlIklan, durasi;
    double totBiaya;
    double ppn, diskon, biayaIklan;
    String nama, alamat, souvenir;
    Scanner input = new Scanner(System.in);

    public PasangIklan(String cabang) {
        super(cabang);
    }

    public void setNota(int noNota) {
        this.noNota = noNota;
    }

    public void inputJumlah() {
        System.out.println("Tarif Iklan : ");
        System.out.println("1. Rp. 20.000/baris");
        System.out.println("2. Rp. 25.000/mmk");
        System.out.print("Pilih : ");
            this.tarifIklan = input.nextDouble();
        if (this.tarifIklan == 1) {
            System.out.print("Jumlah Baris : ");
            this.jmlIklan = input.nextInt();
        } else if (this.tarifIklan == 2) {
            System.out.println("");
            System.out.println("");
            System.out.print("Luas (mmk) : ");
            this.jmlIklan = input.nextInt();
        }
    }

    public double getTarifIklan() {
        if (this.kodeIklan == 1) {
            this.tarifIklan = 20000;
        } else if (this.kodeIklan == 2) {
            this.tarifIklan = 25000;
        }
        return this.tarifIklan;

    }

    public void setTarifIklan(int tarifIklan) {
        this.tarifIklan = tarifIklan;
    }

    public void inputDurasi() {
        System.out.print("Durasi (hari) : ");
        this.durasi = input.nextInt();
        System.out.print("Diskon (%) : ");
        this.diskon = input.nextDouble();
    }

    public double getDiskon() {
        return this.diskon;
    }

    public double getBiayaIklan() {
        this.biayaIklan = getTarifIklan() * this.jmlIklan * this.durasi - this.diskon;
        return this.biayaIklan;
    }

    public double getPpn() {
        this.ppn = (this.biayaIklan * 10) / 100;
        return this.ppn;
    }

    public double getTotal() {
        this.totBiaya = this.biayaIklan + this.ppn;
        return this.totBiaya;
    }

    public String getSouvenir() {
        if (this.kodeIklan == 2) {
            if (this.durasi >= 3 && this.durasi <= 6) {
                this.souvenir = "Mug";
            } else if (this.durasi >= 7 && this.durasi <= 10) {
                this.souvenir = "Payung";
            } else if (this.durasi >= 11 && this.durasi <= 14) {
                this.souvenir = "Tas";
            } else {
                this.souvenir = "Tidak Ada";
            }
        } else {
            this.souvenir = "Tidak Ada";
        }
        return this.souvenir;
    }

    public void cetak() {
        System.out.println("Daftar Iklan Cetak " + super.cabang);
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("No \t Nota \t Produk Iklan \t Tarif \t Jml/Luas \t Durasi \t PPN \t\t Total Biaya \t\t Souvenir");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(this.noNota + " \t " + this.noNota + " \t " + super.nmIklan + " \t " + this.tarifIklan + " \t " + this.jmlIklan + " \t " + this.durasi
                + " \t\t " + getPpn() + " \t " + this.totBiaya + " \t " + getSouvenir());
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t***Total***" + "\t" + this.totBiaya + "\t" + this.souvenir);
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
    }

    public void setAlamat(String alamat2) {

    }

    public void setSouvenir(String souvenir2) {
    }

    public void setDiskon(int diskon2) {
    }

    public void setTotal(int total) {
    }

    public String getTotalBayar() {
        return null;
    }

}

// class Iklan {
// int kodeIklan, tarifIklan;
// String nmIklan, cabang;
// Scanner input = new Scanner(System.in);

// public Iklan(String cabang) {
// this.cabang = cabang;
// }

// public void inputIklan() {
// System.out.println("1. Iklan Baris");
// System.out.println("2. Iklan Display");
// System.out.print("Pilih Jenis Iklan : ");
// kodeIklan = input.nextInt();
// if (kodeIklan == 1) {
// nmIklan = "Iklan Baris";
// } else if (kodeIklan == 2) {
// nmIklan = "Iklan Display";
// }
// }
// }
