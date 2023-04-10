public class Airplane extends Transport {
    private int maxAltitude;

    public Airplane(String name, int speed, int maxAltitude) {
        super(name, speed);
        this.maxAltitude = maxAltitude;
    }


    public void display() {
        System.out.printf("Name: %s, Speed: %d, Max Altitude: %d%n", name, speed, maxAltitude);
    }


}
