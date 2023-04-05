import transportasi.*;

public class TransportasiDemo {
    public static void main(String[] args) {
        // Membuat Object
        Mobil mobil1 = new Mobil();

        // Memanggil atribut
        mobil1.warna = "Hitam";
        mobil1.tahun_produksi = 2003;

        System.out.println("=== KETERANGAN MOBIL ===");
        System.out.println("Warna Mobil 1 : " + mobil1.warna);
        System.out.println("Tahun Mobil 1 : " + mobil1.tahun_produksi);
        System.out.println("=== BEHAVIOUR MOBIL ===");
        // nyalakan mesin mobil
        mobil1.hidupkan_mobil();

        // atur porsneling / gigi mobil
        mobil1.tambah_gigi();
        mobil1.tambah_gigi();
        mobil1.tambah_gigi();
        mobil1.kurang_gigi();
        mobil1.kurang_gigi();
        mobil1.kurang_gigi();

        // matikan mesin mobil
        mobil1.matikan_mobil();

        // Bicycle Class
        System.out.println("========== Bicycle ==========");
        Bicycle bicycle = new Bicycle();
        bicycle.inGear();
        bicycle.inSpeed();
        bicycle.inSpeed();
        bicycle.inGear();
        bicycle.inSpeed();
        bicycle.inSpeed();
        bicycle.inSpeed();
        bicycle.disGear();
        bicycle.disSpeed();
        bicycle.disSpeed();
        bicycle.disSpeed();
        bicycle.disGear();
        bicycle.disSpeed();
        bicycle.disSpeed();

    }
}
