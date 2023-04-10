public abstract class Transport {
    protected String name;
    protected int speed;

    public Transport(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public void display() {
        System.out.printf("Name: %s, Speed: %d%n", name, speed);
    }

}
