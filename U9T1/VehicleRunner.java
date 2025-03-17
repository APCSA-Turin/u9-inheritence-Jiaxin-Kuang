public class VehicleRunner {
    public static void main(String[] args) {
        // testing all available methods on a Vehicle object
        Vehicle myVehicle = new Vehicle("Generic Vehicle", 6);
        System.out.println(myVehicle.getName());
        System.out.println(myVehicle.getWheels());
        myVehicle.move(10);
        myVehicle.turn();
        myVehicle.brake();

        // testing all available methods on a Car object
        Car myCar = new Car("Honda Civic", 4, "leather");
        System.out.println(myCar.getName()); // inherited method
        System.out.println(myCar.getWheels()); // inherited method
        System.out.println(myCar.getFabric()); // method ONLY available on Car objects
        myCar.move(30); // inherited method
        myCar.turn(); // inherited method
        myCar.brake(); // inherited method
        myCar.honk(); // method ONLY available on Car objects
        myCar.lockDoors(); // method ONLY available on Car objects

        // ---- WRITE YOUR BICYCLE TEST CODE BELOW ----
        Bicycle myBicycle = new Bicycle("BMX", 2, 8);
        System.out.println(myBicycle.getGearCount());
        System.out.println(myBicycle.getName());
        System.out.println(myBicycle.getWheels());
        myBicycle.ringBell();
        myBicycle.move(120);
        myBicycle.turn();
        myBicycle.brake();
        // ---- WRITE YOUR BUS TEST CODE BELOW ----
        Bus myBus = new Bus("Public Bus", 4, 40, 15);
        System.out.println("Max Capacity: " + myBus.getMaxCapacity());
        myBus.move(240);
        myBus.turn();
        myBus.brake();
        myBus.leavePassenger(3);
        myBus.newPassenger(5);
        System.out.println("Current Capacity: " + myBus.getCurrentCapacity());
    }
}