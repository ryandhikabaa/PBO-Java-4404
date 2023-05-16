public class BalokDemo {
    public static void main(String[] args) {
        Balok demo = new Balok();
        demo.p = 10;
        demo.l = 5;
        demo.t = 5;
        demo.hitungLuas();
        demo.hitungVolume();
        demo.cetak();
        System.out.println("");
        demo.l = 7;
        demo.hitungLuas();
        demo.hitungVolume();
        demo.cetak("Baloku");
    }
}
