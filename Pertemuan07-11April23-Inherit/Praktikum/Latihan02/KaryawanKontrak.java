import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KaryawanKontrak extends Karyawan {
    private double upahHarian;
    private double totalUpah;
    private int totalHariMasuk;
    private int jumlahAnak;

    public KaryawanKontrak() {

    }

    public KaryawanKontrak(String nama, String nip, String statusPegawai, double upahHarian, int totalHariMasuk) {
        super(nama, nip, statusPegawai);
        this.upahHarian = upahHarian;
        this.totalHariMasuk = totalHariMasuk;
    }

    public double getUpahHarian() {
        return upahHarian;
    }

    public void setUpahHarian(double upahHarian) {
        this.upahHarian = upahHarian;
    }

    public int getTotalHariMasuk() {
        return totalHariMasuk;
    }

    public void setTotalHariMasuk(int totalHariMasuk) {
        this.totalHariMasuk = totalHariMasuk;
    }

    void inputKaryawanKontrak() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("========== INPUT KEPERLUAN KARYAWAN KONTRAK ==========");
        System.out.print("Jumlah Anak : ");
        jumlahAnak = Integer.parseInt(input.readLine());
        System.out.print("Upah Harian : ");
        upahHarian = Double.parseDouble(input.readLine());
        System.out.print("Total Hari Masuk : ");
        totalHariMasuk = Integer.parseInt(input.readLine());
    }

    public double getTotalUpah() {
        totalUpah = (upahHarian * totalHariMasuk) + (jumlahAnak * tunjanganAnak);
        return totalUpah;
    }
}
