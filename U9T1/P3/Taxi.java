public class Taxi extends Car {
    double fareCollected;

    public Taxi(String licensePlate, double tollFee, int passengers, boolean electric, double fareCollected) {
        super(licensePlate, tollFee, passengers, electric);
        this.fareCollected = fareCollected;
    }
    
    public double getFareCollected(){
        applyDiscount();
        return fareCollected;
    }

    public void printTaxi(){
        System.out.println("Taxi's license plate: " + getLicensePlate());
        System.out.println("Taxi's toll fee: " + getTollFee());
        System.out.println("Taxi's number of passengers: " + getPassengers());
        System.out.println("Electric? " + isElectric());
        System.out.println("Discount applied? " + isDiscountApplied());
        System.out.println("Total fare collected: " + fareCollected);
    }

    public void pickupRiders(int numRiders, double farePerRider){
        setPassengers(getPassengers() + numRiders);
        fareCollected += numRiders * farePerRider;
    }
}
