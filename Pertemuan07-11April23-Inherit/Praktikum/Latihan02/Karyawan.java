package Latihan02;

public class Karyawan {
    private String nama, nip;
    public double tunjanganAnak = 300000;

    public Karyawan(String nama, String nip) {
        this.nama = nama;
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public String getNip() {
        return nip;
    }
}
