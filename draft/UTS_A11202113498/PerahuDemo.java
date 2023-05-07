class Perahu extends Air {
    private int muatan;

    public int getMuatan() {
        return muatan;
    }

    public void setMuatan(int muatan) {
        this.muatan = muatan;
    }

    Perahu() {
        this.muatan = 0;
    }

    Perahu(String nama, int tahunProduksi, boolean mesin, int muatan) {
        super(nama, tahunProduksi, mesin);
        this.muatan = muatan;
    }

    public void reset(String nama, int tahunProduksi, boolean mesin, int muatan)
    // mereset data default values
    {
        setNama(nama); // memanggil method setNama dari Kendaraan
        setTahunProduksi(tahunProduksi); // memanggil method setTahunProduksi dari Kendaraan
        setMesin(mesin); // memanggil method setMesin dari Udara
        setMuatan(muatan);
    }

    public String kategori(int muatan) {
        String jenisKategori = "";
        // Belom ada soalnya
        if (muatan <= 4)
            jenisKategori = "Perahu Kecil";
        else if (muatan <= 10)
            jenisKategori = "Perahu Sedang";
        else
            jenisKategori = "Perahu Besar";
        return jenisKategori;
    }

    public void cetak() {
        String hasilMesin = "";
        if (mesin == true) {
            hasilMesin = "Baling - Baling";
        } else {
            hasilMesin = "Dayung";
        }
        System.out.println("Nama\t\t= " + nama);
        System.out.println("Tahun Produksi\t= " + tahunProduksi);
        System.out.println("Mesin\t\t= " + hasilMesin);
        System.out.println("Muatan\t\t= " + muatan);
        System.out.println("Kategori\t= " + nama);
    }
}

public class PerahuDemo {
    public static boolean isNamaSama(Perahu p1, Perahu p2) {
        boolean checkKesamaan = true;

        if (p1.getNama().toLowerCase().equals(p2.getNama().toLowerCase())) {
            checkKesamaan = true;
        } else {
            checkKesamaan = false;
        }
        return checkKesamaan;
    }

    public static int min2(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Perahu[] pPerahu = new Perahu[3];
        pPerahu[0] = new Perahu();
        pPerahu[1] = new Perahu("Kapal Feri", 1990, true, 250);
        pPerahu[2] = new Perahu("Perahu Karet", 2010, false, 10);
        pPerahu[0].reset("Perahu Tradisional", 1988, false, 2);

        // Cetak
        System.out.println("********** CETAK KENDARAAN **********");
        System.out.println("");
        System.out.println("Kendaraan 1");
        pPerahu[0].cetak();
        System.out.println("");
        System.out.println("Kendaraan 2");
        pPerahu[1].cetak();
        System.out.println("");
        System.out.println("Kendaraan 3");
        pPerahu[2].cetak();

        System.out.print("");
        System.out.print("Nama Perahu pertama dan kedua ");
        if (isNamaSama(pPerahu[0], pPerahu[1])) {
            System.out.println("sama");
        } else {
            System.out.println("tidak sama");
        }
        if (pPerahu[0].getMuatan() <

                min2(pPerahu[1].getMuatan(), pPerahu[2].getMuatan()))
            System.out.println("Muatan paling sedikit =" + pPerahu[0].getNama());
        else if (pPerahu[1].getMuatan() < min2(pPerahu[0].getMuatan(), pPerahu[2].getMuatan()))
            System.out.println("Muatan paling sedikit =" + pPerahu[1].getNama());
        else
            System.out.println("Muatan paling sedikit =" + pPerahu[2].getNama());

    }

}
