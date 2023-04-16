public class KaryawanDemo {
    public static void main(String[] args) {
        // Membuat objek karyawan tetap
        KaryawanTetap karyawanTetap = new KaryawanTetap("Ryandhika", "A11.2021.13498", 4000000);
        System.out.println("Nama karyawan tetap: " + karyawanTetap.getNama());
        System.out.println("NIP karyawan tetap: " + karyawanTetap.getNip());
        System.out.println("Tunjangan anak: " + karyawanTetap.tunjanganAnak);
        System.out.println("Gaji pokok: " + karyawanTetap.getGajiPokok());
        System.out.println("Total gaji: " + karyawanTetap.getTotalGaji() + "\n\n");

        // Membuat objek karyawan kontrak
        KaryawanKontrak karyawanKontrak = new KaryawanKontrak("Bintang", "A11.2021.13499", 100000, 25);
        System.out.println("Nama karyawan kontrak: " + karyawanKontrak.getNama());
        System.out.println("NIP karyawan kontrak: " + karyawanKontrak.getNip());
        System.out.println("Tunjangan anak: " + karyawanKontrak.tunjanganAnak);
        System.out.println("Upah Harian: " + karyawanKontrak.getUpahHarian());
        System.out.println("Total Hari Masuk: " + karyawanKontrak.getTotalHariMasuk());
        System.out.println("Total gaji: " + karyawanKontrak.getTotalUpah());

    }
}
