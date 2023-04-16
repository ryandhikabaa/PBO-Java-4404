class Mobil2BMW extends Mobil2 {
    void nontonTV() {
        System.out.println("TV Dihidupkan...");
        System.out.println("TV Mencari Channel...");
        System.out.println("TV Menampilkan gambar...");
    }
}

public class Mobil2BMWDemo {
    public static void main(String[] args) {
        Mobil2BMW mobil2bmw = new Mobil2BMW();

        mobil2bmw.hidupkan_mobil();
        mobil2bmw.nontonTV();
        mobil2bmw.tambah_gigi();
        mobil2bmw.tambah_gigi();
        mobil2bmw.kurang_gigi();
        mobil2bmw.kurang_gigi();
        mobil2bmw.matikan_mobil();
    }
}
