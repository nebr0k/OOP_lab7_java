public class Main {
    public static void main(String[] args) {
        Transport[] transports = new Transport[4];
        transports[0] = new Car("Honda Civic", 180, 5);
        transports[1] = new Truck("Volvo FH16", 90, 40000);
        transports[2] = new Steamship("Queen Mary 2", 80, 2620);
        transports[3] = new Airplane("Boeing 747", 920, 13100);

        for (Transport t : transports) {
            t.display();
        }
    }
}
