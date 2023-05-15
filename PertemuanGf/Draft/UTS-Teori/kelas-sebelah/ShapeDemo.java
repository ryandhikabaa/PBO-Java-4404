public class ShapeDemo {
    public static void main(String[] args) {

        // ini misalkan dari inputan diperoleh nilai length dan width yang sama
        System.out.println("TEST RECTANGLE SQUARE");
        double length = 10;
        double width = 10;

        // check apakah length dan width sama, jika sama panggilnya yang dari Class
        // Square karena sisinya sama
        if (length == width) {
            // panggil construktor yang memiliki parameter side, color, dan filled, kenapa
            // side karena sisinya sama, lalu warna dan filled didapatkan dari super
            Square objRectangleSquare = new Square(length, "Red", true);
            objRectangleSquare.cetak();
        } else
        // check apakah length dan width jika berbeda maka panggil class Rectangle
        // karena sisinya tidak sama
        {
            Rectangle objRectangle = new Rectangle(length, width, "Red", true);
            objRectangle.cetak();
        }

        // ini misalkan dari inputan diperoleh nilai length dan width yang berbeda
        System.out.println("TEST RECTANGLE BIASA");
        // nilainya ditimpa atau di replace
        length = 30;
        width = 10;

        // check apakah length dan width sama, jika sama panggilnya yang dari Class
        // Square karena sisinya sama
        if (length == width) {
            // panggil construktor yang memiliki parameter side, color, dan filled, kenapa
            // side karena sisinya sama, lalu warna dan filled didapatkan dari super
            Square objRectangleSquare = new Square(length, "Red", true);
            objRectangleSquare.cetak();
        } else
        // check apakah length dan width jika berbeda maka panggil class Rectangle
        // karena sisinya tidak sama
        {
            Rectangle objRectangle = new Rectangle(length, width, "Red", true);
            objRectangle.cetak();
        }

    }
}
