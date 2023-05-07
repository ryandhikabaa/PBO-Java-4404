import java.io.IOException;

public class KaryawanDemo {
    public static void main(String[] args) throws IOException {
        // Menggunakan Constructor kosong, kenapa? karena input dilakukan dalam class
        Karyawan karyawan = new Karyawan();
        karyawan.inputKaryawan();
        if (karyawan.getStatusPegawai().equals("tetap")) {
            KaryawanTetap karyawanTetap = new KaryawanTetap();
            karyawanTetap.inputKaryawanTetap();
            System.out.println("Gaji yang diperoleh karyawan tetap : " + karyawanTetap.getTotalGaji());
        } else if (karyawan.getStatusPegawai().equals("kontrak")) {
            KaryawanKontrak karyawanKontrak = new KaryawanKontrak();
            karyawanKontrak.inputKaryawanKontrak();
            System.out.println("Gaji yang diperoleh karyawan kontrak: " + karyawanKontrak.getTotalUpah());
        } else {
            System.out.println("Status Pekerjaan tidak dikenal");
        }

    }
}
