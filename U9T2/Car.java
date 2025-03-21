package U9T2;

public class Car extends Vehicle {
    private boolean electric;
    private boolean discountApplied;
    
    public Car(String licensePlate, double tollFee, int passengers, boolean electric) {
      super(licensePlate, tollFee, passengers);
      this.electric = electric;
      discountApplied = false;   
    }
  
    public boolean isElectric() {
      return electric;
    }
  
    public boolean isDiscountApplied() {
      return discountApplied;
    }
  
    public void setDiscountApplied(boolean newValue) {
      discountApplied = newValue;
    }
  
    public boolean dropOffPassengers(int numOut) {
      int currentPassengers = getPassengers();
  
      if (numOut < currentPassengers) {
        setPassengers(currentPassengers - numOut);
        return true;  
      } else {
        return false;
      }
    }
  
    public void applyDiscount() {
      if (!discountApplied) {
        if (isElectric()) {
          double discountedFee = getTollFee() * 0.5;
          setTollFee(discountedFee);
          discountApplied = true;
        }
      }
    }

    @Override 
    public double calculateTollPrice(){
        if(getPassengers() > 4){
            return getTollFee() * 4;
        }
        return super.calculateTollPrice();
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Electric? " + electric);
        System.out.println("Apply discount? " + discountApplied);
    }
}
  