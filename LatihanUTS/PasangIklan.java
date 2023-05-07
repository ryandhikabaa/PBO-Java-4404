public class PasangIklan {
    String noNota; // *
    String namaPemasang; // *
    String alamatPemasang; // *
    Double jmlIklan; // *
    Double durasiIklan; // *
    Double diskonIklan;
    Double biayaIklan;
    Double ppnIklan;
    Double totalBiayaIklan;
    String souvenir;
    Double totalPendapatan;

    PasangIklan(String noNota, String namaPemasang, String alamatPemasang, Double jmlIklan, Double durasiIklan) {
        this.noNota = noNota;
        this.namaPemasang = namaPemasang;
        this.alamatPemasang = alamatPemasang;
        this.jmlIklan = jmlIklan;
        this.durasiIklan = durasiIklan;
    }

}
