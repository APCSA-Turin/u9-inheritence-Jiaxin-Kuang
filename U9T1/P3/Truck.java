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

    public boolean validateLicensePlate(){
        if(hasTrailer && axles > 4 && getLicensePlate().substring(4,6).equals("MX")){
            return true;
        }
        else if(hasTrailer && axles <= 4 && getLicensePlate().substring(4,6).equals("LX")){
            return true;
        }
        else if(!hasTrailer){
            return true;
        }
        return false;
    }

    public void printTruck(){
        System.out.println("Truck's license plate: " + getLicensePlate());
        System.out.println("Truck's toll fee: " + getTollFee());
        System.out.println("Truck's number of passengers: " + getPassengers());
        System.out.println("Truck's axles " + axles);
        System.out.println("Has trailer or not: " + hasTrailer);
      }
}