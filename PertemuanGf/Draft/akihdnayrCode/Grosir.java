import java.util.Scanner;

class Produk {
    // ini nnti variable di class orang tua
    String kdProduk;
    String nmProduk;
    double hrgBeli;
    double hrgJual;

    Scanner scanner = new Scanner(System.in);

    void inputProduk() {
        System.out.print("Kode Produk\t: ");
        this.kdProduk = scanner.next();
        System.out.print("Nama Produk\t: ");
        this.nmProduk = scanner.next();
        System.out.print("Harga Beli\t: ");
        this.hrgBeli = scanner.nextDouble();

        // mendapatkan harga jual
        if (this.hrgBeli > 200000) {
            this.hrgJual = this.hrgBeli + (0.1 * this.hrgBeli);
        } else if (this.hrgBeli > 100000) {
            this.hrgJual = this.hrgBeli + (0.15 * this.hrgBeli);
        } else if (this.hrgBeli > 50000) {
            this.hrgJual = this.hrgBeli + (0.2 * this.hrgBeli);
        } else if (this.hrgBeli > 25000) {
            this.hrgJual = this.hrgBeli + (0.3 * this.hrgBeli);
        } else if (this.hrgBeli < 25000) {
            this.hrgJual = this.hrgBeli + (0.5 * this.hrgBeli);
        }

        System.out.println("Harga Jual\t: " + this.hrgJual);
    }
}

public class Grosir extends Produk {
    String ketByr, souvenir, cabang;
    int noNota, jmlJual, jnsByr, lamaTempo;
    double totJual, ppn, bunga, totByr;

    public Grosir(String cabang) {
        this.cabang = cabang;

        super.inputProduk();
    }

    void setNota() {
        int max = 99999999;
        int min = 10000000;
        int range = max - min + 1;
        this.noNota = (int) (Math.random() * range) + min;
    }

    void inputJumlah() {
        System.out.print("Jumlah Jual\t: ");
        this.jmlJual = scanner.nextInt();
        hitungJual();
        System.out.println("Total\t : " + this.totJual);
    }

    double getHargaJual() {
        return super.hrgJual;
    }

    void inputJenis() {
        int inputNomorJenis;
        System.out.print("Jenis Bayar (1. Cash | 2. Tempo): ");
        inputNomorJenis = scanner.nextInt();
        if (inputNomorJenis == 1) {
            this.ketByr = "Cash";
            System.out.println("Ket. Bayar\t: " + this.ketByr);
        } else {
            this.ketByr = "Tempo";
            System.out.println("Ket. Bayar\t: " + this.ketByr);
            babTempo();
        }
    }

    void hitungJual() {
        this.totJual = this.jmlJual * super.hrgJual;
    }

    void babTempo() {
        System.out.print("Waktu Tempo (dalam minggu) : ");
        this.lamaTempo = scanner.nextInt();
    }

    void getPPN() {
        this.ppn = 0.11 * this.totJual;
        System.out.println("PPN\t: " + this.ppn);
    }

    void getBunga() {
        if (this.lamaTempo > 2) {
            this.bunga = 0.5 * this.totJual;
        } else {
            this.bunga = 0;
        }
        System.out.println("Bunga\t: " + this.bunga);
    }

    void getTotalBayar() {
        this.totByr = this.totJual + this.ppn + this.bunga;
        System.out.println("Total Bayar\t: " + this.totByr);
    }

    void getSouvenir() {
        if (this.ketByr.equals("Cash")) {
            if (this.totByr >= 100000 && this.totByr <= 500000) {
                this.souvenir = "Mangkok";
            } else if (this.totByr >= 500.001 && this.totByr <= 750000) {
                this.souvenir = "Payung";
            } else if (this.totByr >= 750000 && this.totByr <= 1000000) {
                this.souvenir = "Tas Belanja";
            } else if (this.totByr > 1000000) {
                this.souvenir = "Voucher 100rb";
            } else {
                this.souvenir = "Tidak Ada";
            }
        } else {
            this.souvenir = "Tidak Ada";
        }
        System.out.println("Souvenir\t: " + this.souvenir);
    }

    void cetak() {
        System.out.println(this.noNota + "      "
                + super.kdProduk + "    "
                + super.nmProduk + "      "
                + super.hrgBeli + "      "
                + super.hrgJual + "      "
                + this.jmlJual + "      "
                + this.totJual + "      "
                + this.ketByr + "      "
                + this.lamaTempo + "      "
                + this.ppn + "      "
                + this.bunga + "      "
                + this.totByr + "      "
                + this.souvenir);

    }

}
