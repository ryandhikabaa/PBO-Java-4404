public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    // constructor kosong
    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    // getter setter
    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return this.width * this.length;
    }

    public double getPerimeter() {
        // ini perlu dipastikan lagi
        return this.width * this.length;
    }

    public void cetak() {
        System.out.println("Warna   : " + super.getColor());
        System.out.println("Tinggi  : " + getLength());
        System.out.println("Lebar   : " + getWidth());
        System.out.println("Luas    : " + getArea());
    }
}

class Square extends Rectangle {
    private double side;

    public Square() {

    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
        this.side = side;
    }

    // getter setter
    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(double side) {
        super.setWidth(side);
    }

    public void setLength(double side) {
        super.setLength(side);
    }

    public void cetak() {
        System.out.println("Warna   : " + super.getColor());
        System.out.println("Tinggi  : " + super.getLength());
        System.out.println("Lebar   : " + super.getWidth());
        System.out.println("Luas    : " + super.getArea());
    }

}
