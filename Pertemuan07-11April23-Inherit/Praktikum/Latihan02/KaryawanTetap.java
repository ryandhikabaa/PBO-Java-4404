public class KaryawanTetap extends Karyawan {
    private double gajiPokok;
    private double totalGaji;

    public KaryawanTetap(String nama, String nip, double gajiPokok) {
        super(nama, nip);
        this.gajiPokok = gajiPokok;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public double getTotalGaji() {
        totalGaji = gajiPokok + tunjanganAnak;
        return totalGaji;
    }
}
