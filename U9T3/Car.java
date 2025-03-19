public class Car extends Vehicle {
    private boolean electric;
    private boolean discountApplied;
    
    public Car(String licensePlate, double tollFee, int passengers, boolean electric) {
      super(licensePlate, tollFee, passengers);
      this.electric = electric;
      discountApplied = false;   // default value
    }
  
    public boolean isElectric() {
      return electric;
    }
  
    public boolean isDiscountApplied() {
      return discountApplied;
    }

    public void applyDiscount(){
      if((isElectric() || getPassengers() >= 4) && !discountApplied){
        setTollFee(getTollFee()/2);
        discountApplied = true;
      }
    }

    public boolean dropOffPassengers(int numOut){
      if(numOut >= getPassengers()){
        return false;
      }
      else{
        setPassengers(getPassengers() - numOut);
        return true;
      }
    }

    public void printCar(){
      System.out.println("Car's license plate: " + getLicensePlate());
      System.out.println("Car's toll fee: " + getTollFee());
      System.out.println("Car's number of passengers: " + getPassengers());
      System.out.println("Electric? " + electric);
      System.out.println("Discount applied? " + discountApplied);
    }
  }