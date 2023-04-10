public class Steamship extends Transport {
    private int numPassengers;

    public Steamship(String name, int speed, int numPassengers) {
        super(name, speed);
        this.numPassengers = numPassengers;
    }

    public void display() {
        System.out.printf("Name: %s, Speed: %d, Number of Passengers: %d%n", name, speed, numPassengers);
    }


}
