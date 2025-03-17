public class Car extends Vehicle {
    private String fabric;

    public Car(String name, int wheels, String fabric) {
        super(name, wheels);
        this.fabric = fabric;
    }

    public String getFabric() {
        return fabric;
    }

    public void honk() {
        System.out.println("Honk honk! Get outta my way!");
    }

    public void lockDoors() {
        System.out.println("Doors Locked, Car Secure");
    }
}