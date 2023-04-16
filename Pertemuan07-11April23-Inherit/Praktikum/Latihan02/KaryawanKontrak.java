public class KaryawanKontrak extends Karyawan {
    private double upahHarian;
    private double totalUpah;
    private int totalHariMasuk;

    public KaryawanKontrak(String nama, String nip, double upahHarian, int totalHariMasuk) {
        super(nama, nip);
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

    public double getTotalUpah() {
        totalUpah = (upahHarian * totalHariMasuk) + tunjanganAnak;
        return totalUpah;
    }
}
