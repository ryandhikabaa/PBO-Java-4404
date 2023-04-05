import java.util.Scanner;
public class Penjualan {
    String kode,nama,bonus;
    double totalPembelian;
    float harga;
    int jumlah;
    Scanner sc=new Scanner(System.in);
    public Penjualan(String kode,String nama, float harga,int jumlah){
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }
    public Penjualan(){}
    double getTotalPembelian(double totalPembelian){
        totalPembelian=harga*jumlah;
        return totalPembelian;
    }
    String getBonus(double totalPembelian,int jumlah){
        if(totalPembelian>=500000&&jumlah>5)
        bonus="Setrika";
        else if(totalPembelian>=100000&&jumlah>3)
        bonus="Payung";
        else if(totalPembelian>=50000||jumlah>2)
        bonus="Ballpoint";
        else
        bonus="Maaf, anda tidak mendapat bonus";
        return bonus;
    }
    void cetakNota(){
        System.out.println("********************************");
        System.out.println("kode        : "+kode);
        System.out.println("nama        : "+nama);
        System.out.println("harga       : "+harga);
        System.out.println("jumlah      : "+jumlah);
        System.out.println("Total       : "+getTotalPembelian(totalPembelian));
        System.out.println("Bonus       : "+getBonus(getTotalPembelian(totalPembelian),jumlah));
        System.out.println("********************************");
    }
    void isiData(){
        System.out.print("kode      : ");kode=sc.next();
        System.out.print("nama      : ");nama=sc.next();
        System.out.print("harga     : ");harga=sc.nextFloat();
        System.out.print("jumlah    : ");jumlah=sc.nextInt();
    }
}
