public class Air extends Kendaraan {
    protected boolean mesin = false;

    public void setMesin(boolean mesin) {
        this.mesin = mesin;
    }

    public boolean getMesin() {
        return mesin;
    }

    Air() {
        this.mesin = true;
    }

    Air(String nama, int tahunProduksi, boolean mesin) {
        super(nama, tahunProduksi);
        this.mesin = mesin;
    }

    public void cetak() {
    }
}
