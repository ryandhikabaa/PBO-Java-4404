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

import java.util.Scanner;
class Iklan {
    int kodeIklan; 
    double tarifIklan;
    String nmIklan, cabang;
    Scanner input = new Scanner(System.in);
    public Iklan(String cabang) {
        this.cabang = cabang;
    }
    public void inputIklan() {
        System.out.println("1. Iklan Baris");
        System.out.println("2. Iklan Display");
        System.out.print("Pilih Jenis Iklan : ");
        this.kodeIklan = input.nextInt();
        if (this.kodeIklan == 1) {
            this.nmIklan = "Iklan Baris";
        } else if (this.kodeIklan == 2) {
            this.nmIklan = "Iklan Display";
        }
    }

}