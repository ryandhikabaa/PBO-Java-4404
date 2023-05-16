public class TambahArgument {
    public static void main(String[] args) {
        try {
            int jumlah = 0;
            for (int i = 0; i < args.length; i++) {
                jumlah += Integer.parseInt(args[i]);
            }
            System.out.println("Jumlah : " + jumlah);
        } catch (Exception e) {
            System.err.println("Salah satu argument bukan integer");
        }
    }
}
