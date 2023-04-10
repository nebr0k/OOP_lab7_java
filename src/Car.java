public class Car extends Transport {
    private int numSeats;

    public Car(String name, int speed, int numSeats) {
        super(name, speed);
        this.numSeats = numSeats;
    }


    public void display() {
        System.out.printf("Name: %s, Speed: %d, Number of Seats: %d%n", name, speed, numSeats);
    }


}
