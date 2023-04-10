public class Truck extends Transport {
    private int maxLoad;

    public Truck(String name, int speed, int maxLoad) {
        super(name, speed);
        this.maxLoad = maxLoad;
    }


    public void display() {
        System.out.printf("Name: %s, Speed: %d, Max Load: %d%n", name, speed, maxLoad);
    }


}
