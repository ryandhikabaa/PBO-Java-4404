class MountainBike extends Bicycle {
    int seatHeight;

    public void seatHeight(int newValue) {
        seatHeight = newValue;
        System.out.println("Seat height : " + seatHeight);
    }
}

class MountainBikeDemo {
    public static void main(String[] args) {
        MountainBike mbike = new MountainBike();

        mbike.speedUp(10);
        mbike.changeGear(2);
        mbike.seatHeight(20);
    }
}
