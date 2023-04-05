package transportasi;

public class Bicycle {
    public int gear = 0;
    public int speed = 0;

    public void inGear() {
        gear++;
        System.out.println("Gigi Sekarang : " + gear);
    }

    public void disGear() {
        gear--;
        System.out.println("Gigi Sekarang : " + gear);
    }

    public void inSpeed() {
        speed += 10;
        System.out.println("Speed Sekarang : " + speed);
    }

    public void disSpeed() {
        speed -= 10;
        System.out.println("Speed Sekarang : " + speed);
    }

}
