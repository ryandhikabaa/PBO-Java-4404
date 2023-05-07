import java.util.Scanner;

public class MainIklan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilih, noNota = 0;
        String cabang;
        System.out.println("Pilih Cabang : ");
        System.out.println("1. Jakarta");
        System.out.println("2. Bandung");
        System.out.println("3. Surabaya");
        System.out.print("Pilih : ");
        pilih = input.nextInt();
        switch (pilih) {
            case 1:
                cabang = "Jakarta";
                break;
            case 2:
                cabang = "Bandung";
                break;
            case 3:
                cabang = "Surabaya";
                break;
            default:
                cabang = "Jakarta";
                break;
        }
        System.out.print("Jumlah Iklan : ");
        int jml = input.nextInt();
        System.out.println("");
        PasangIklan[] iklan = new PasangIklan[jml];
        for (int i = 0; i < iklan.length; i++) {
            noNota++;
            iklan[i] = new PasangIklan(cabang);
            System.out.println("Iklan ke-" + (i + 1));
            System.out.print("Nama Pemasang : ");
            iklan[i].nama = input.next();
            System.out.print("Alamat : ");
            iklan[i].alamat = input.next();
            System.out.println("");
            iklan[i].setNota(noNota);
            iklan[i].inputIklan();
            System.out.println("");
            iklan[i].inputJumlah();
            iklan[i].getTarifIklan();
            iklan[i].inputDurasi();
            iklan[i].getDiskon();
            System.out.println("");
            iklan[i].getBiayaIklan();
            iklan[i].getSouvenir();
            iklan[i].getTotal();
            System.out.println("");
            iklan[i].cetak();
        }
    }
}