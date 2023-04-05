import java.util.Scanner;
public class Faktorial {
    public static void main(String[] args) {
        long fak=1;
        int bil;
        Scanner in=new Scanner(System.in);
        System.out.print("Bilangan      :");
        bil=in.nextInt();
        for(int i=2;i<=bil;i++) {
            System.out.print(fak+" x "+i+" = ");
            fak=fak*i;
            System.out.println(fak);
        }
    }
}
