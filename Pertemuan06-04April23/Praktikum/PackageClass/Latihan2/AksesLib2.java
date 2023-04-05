import id.ac.dinus.lib.MyLib; // langsung mengarang ke class
import id.ac.dinus.lib.YourLib;
import id.ac.dinus.test.*;

public class AksesLib2 {
    public static void main(String[] args) {
        MyLib myLib = new MyLib();
        myLib.cetak();
        YourLib yourLib = new YourLib();
        yourLib.cetak2();
        HisLib hisLib = new HisLib();
        hisLib.cetak3();
    }
}
