class Kendaraan {

    // pertimbangan untuk bisa diakses di kelas inherit lain maka saya gunakan
    // protected
    protected String nama;
    protected int tahunProduksi;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getTahunProduksi() {
        return tahunProduksi;
    }

    public void setTahunProduksi(int tahunProduksi) {
        this.tahunProduksi = tahunProduksi;
    }

    Kendaraan() {
        this.nama = "Anonymous";
        this.tahunProduksi = 0;
    }

    Kendaraan(String nama, int tahunProduksi) {
        this.nama = nama;
        this.tahunProduksi = tahunProduksi;
    }

    public void cetak() {

    }
}