import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KaryawanTetap extends Karyawan {
    private double gajiPokok;
    private double totalGaji;
    private int jumlahAnak;

    public KaryawanTetap() {

    }

    public KaryawanTetap(String nama, String nip, String statusPegawai, double gajiPokok) {
        super(nama, nip, statusPegawai);
        this.gajiPokok = gajiPokok;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    void inputKaryawanTetap() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("========== INPUT KEPERLUAN KARYAWAN TETAP ==========");
        System.out.print("Jumlah Anak : ");
        jumlahAnak = Integer.parseInt(input.readLine());
        System.out.print("Gaji Pokok : ");
        gajiPokok = Double.parseDouble(input.readLine());
    }

    public double getTotalGaji() {
        totalGaji = gajiPokok + (jumlahAnak * tunjanganAnak);
        return totalGaji;
    }
}
