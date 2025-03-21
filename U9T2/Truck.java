package U9T2;

public class Truck extends Vehicle {
    private int axles;
    private boolean hasTrailer;
    
    public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer) {
      super(licensePlate, tollFee, passengers);
      this.axles = axles;
      this.hasTrailer = hasTrailer;
    }
  
    public int getAxles() {
      return axles;
    }
  
    public boolean hasTrailer() {
      return hasTrailer;
    }
  
    public boolean validateLicensePlate() {
      if (hasTrailer) {
        String lastTwo = getLicensePlate().substring(getLicensePlate().length() - 2);
        boolean isValid = (lastTwo.equals("MX") && axles > 4) || (lastTwo.equals("LX") && axles <= 4);
        return isValid;
      } else {
        return true;
      }
    }

    @Override 
    public double calculateTollPrice(){
        double tollPrice = 0;
        tollPrice = axles * getTollFee();
        if(hasTrailer){
            tollPrice *= 2;
        }
        return tollPrice;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Axles: " + axles);
        System.out.println("Has trailer? " + hasTrailer);
    }
  }
  