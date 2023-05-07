import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Karyawan {
    private String nama, nip, statusPegawai;
    public double tunjanganAnak = 300000;

    public Karyawan() {
    }

    public Karyawan(String nama, String nip, String statusPegawai) {
        this.nama = nama;
        this.nip = nip;
        this.statusPegawai = statusPegawai;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getStatusPegawai() {
        return statusPegawai;
    }

    void inputKaryawan() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("========== INPUT DATA KARYAWAN ==========");
        System.out.print("Nama Karyawan : ");
        setNama(input.readLine());
        System.out.print("NIP Karyawan : ");
        setNip(input.readLine());
        System.out.print("Status Karyawan : ");
        statusPegawai = input.readLine();
    }

}
