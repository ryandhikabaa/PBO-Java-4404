package transportasi;

public class Mobil {
    public String warna = "";
    public int tahun_produksi = 0;
    public int gigi = 0;
    public boolean kondisi_mobil = false;

    public void tambah_gigi() {
        gigi++;
        System.out.println("Gigi Sekarang : " + gigi);
    }

    public void kurang_gigi() {
        gigi--;
        System.out.println("Gigi Sekarang : " + gigi);
    }

    public void hidupkan_mobil() {
        kondisi_mobil = true;
        if (kondisi_mobil) {
            System.out.println("Mobil dalam posisi menyala");
        } else {
            System.out.println("Mobil dalam posisi mati");
        }
    }

    public void matikan_mobil() {
        kondisi_mobil = false;
        if (kondisi_mobil) {
            System.out.println("Mobil dalam posisi menyala");
        } else {
            System.out.println("Mobil dalam posisi mati");
        }
    }
}
