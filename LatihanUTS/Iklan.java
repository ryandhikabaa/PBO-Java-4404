import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Iklan {
    int kodeIklan;
    String namaIklan;
    int tarifIklan;

    void inputIklan(int kodeIklan) {
        if (kodeIklan == 1) {
            kodeIklan = 1;
            namaIklan = "Iklan Baris";
            tarifIklan = 20000;
        } else if (kodeIklan == 2) {
            kodeIklan = 2;
            namaIklan = "Iklan Baris";
            tarifIklan = 25000;
        }
    }
}