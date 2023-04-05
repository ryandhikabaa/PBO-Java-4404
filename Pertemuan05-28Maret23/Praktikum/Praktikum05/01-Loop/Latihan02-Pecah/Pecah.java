import java.util.Scanner;
public class Pecah {
    public static void main(String[] args) {
        int bil,p;
        Scanner in=new Scanner(System.in);
        System.out.print("Bilangan      :");
        bil=in.nextInt();
        for(int i=1;i<=bil;i++) {
            System.out.print(i+" ");
            if(i%5==0) System.out.println("");
        }
        System.out.println("-------------------------------");
        System.out.print("Dipecah     : ");
        p=in.nextInt();
        for(int i=1;i<=bil;i++){
            System.out.print(i+" ");
            if(i%p==0) System.out.println();
        }
    }
}
