package U9T2;
public class Taxi extends Car {
    private double fareCollected;

    public Taxi(String licensePlate,
                double tollFee,
                int passengers,
                boolean isElectric,
                double fareCollected) {
        super(licensePlate, tollFee, passengers, isElectric); 
        this.fareCollected = fareCollected;
    }

    public double getFareCollected() {
        return fareCollected;
    }

    public void pickupRiders(int numRiders, double farePerRider) {
        setPassengers(getPassengers() + numRiders);

        double fareCost = numRiders * farePerRider;
        fareCollected += fareCost;

        if (getPassengers() >= 4 && !isDiscountApplied()) {
            setTollFee(getTollFee() * 0.5);  
            setDiscountApplied(true);  
        }
    }

    public boolean chargeAndDropOffRiders(double farePerRider){
        double collected = farePerRider * (getPassengers() - 1);
        boolean success = dropOffPassengers(getPassengers() - 1);
        if(success){
            fareCollected += collected;
            return true;
        }
        return false;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Fare Collected: " + fareCollected);
    }

    @Override
    public double parkingFee(){
        return (getFareCollected())/getPassengers();
    }
}