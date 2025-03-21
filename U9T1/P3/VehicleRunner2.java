public class VehicleRunner2 {
    public static void main(String[] args) {
        // -------------- LAB PART 1 -----------------
        // a. write code to create a Vehicle object with license "MC56WQ",
        //    toll fee of 10.75, and 5 passengers.
        //    Print out the calculated toll TollPrice.
        Vehicle v1 = new Vehicle("MC56WQ", 10.75, 5);
        System.out.println(v1.calculateTollPrice());

        // b. write code to create an electric Car with license "KXN73F",
        //    toll fee of 8.50, and 2 passengers.
        //    Print out the calculated toll price
        Car c1 = new Car("KXN73F", 8.50, 2, true);
        System.out.println(c1.calculateTollPrice());

        // c. add a printCar() void method to the Car class that prints the
        //    Car's license plate, toll fee, number of passengers, whether it is electric,
        //    and whether a discount has been applied.
        //
        // d. call the method on the Car you made in c to test it.
        c1.printCar();

        // e. write code to create a Truck with license "3K9JMX",
        //    a toll fee of 24.75, 4 passengers, 6 axles, with a trailer.
        //    Print out the calculated toll price
        /*Truck t1 = new Truck("3K9JMX", 24.75,4, 6, true);
        System.out.println(t1.calculateTollPrice());*/

        // f. add a printTruck() void method to the Truck class that prints the
        //    Truck's license plate, toll fee, number of passengers, number of axles,
        //    and whether it has a trailer.
        //
        // g. call the method on the Truck you made in e to test it.
        //t1.printTruck();

        // ------------ LAB PART 2 ---------------
        // ----- instructions in lab sheet -------
        /*Taxi t2 = new Taxi("8KM23Z", 9.25, 3, true, 5);
        t2.printTaxi();
        t2.printCar();
        System.out.println(t2.isElectric());
        System.out.println(t2.isDiscountApplied());
        System.out.println(t2.getLicensePlate());
        System.out.println(t2.getTollFee());
        System.out.println(t2.getPassengers());
        System.out.println(t2.calculateTollPrice());
        System.out.println(t2.getFareCollected());

        System.out.println(t2 instanceof Car);
        System.out.println(t2 instanceof Vehicle);*/

        // ------------ LAB PART 3 ---------------
        // ----- instructions in lab sheet -------

        /*Car testCar2 = new Car("9KUJ32", 12.25, 6, true);
        boolean successCar = testCar2.dropOffPassengers(3);
        System.out.println("Dropped off passengers? " + successCar);
        System.out.println("Current passengers: " + testCar2.getPassengers());
        System.out.println("-----------");
        Taxi testTaxi2 = new Taxi("DH238P", 7.50, 5, true, 56.75);
        boolean sucessTaxi = testTaxi2.dropOffPassengers(6);
        System.out.println("Dropped off passengers? " + sucessTaxi);
        System.out.println("Current passengers: " + testTaxi2.getPassengers());
        System.out.println("--- Testing method on a Car object ---");*/
        /*System.out.println("--- Testing method on a Car object ---");
        Car testCar1 = new Car("KXN73F", 8.50, 5, true);
        testCar1.applyDiscount();
        System.out.println(testCar1.isDiscountApplied());
        System.out.println(testCar1.getTollFee());
        System.out.println("-----------");
        testCar1.applyDiscount(); // try applying again
        System.out.println(testCar1.isDiscountApplied());
        System.out.println(testCar1.getTollFee());
        System.out.println("--- Testing method on Taxi objects ---");
        Taxi testTaxi1 = new Taxi("JMD645", 10.0, 3, false, 5.0); // not electric
        testTaxi1.applyDiscount();
        System.out.println(testTaxi1.isDiscountApplied());
        System.out.println(testTaxi1.getTollFee());
        System.out.println("-----------");
        Taxi testTaxi2 = new Taxi("ABC645", 12.0, 3, true, 5.0);
        testTaxi2.applyDiscount();
        System.out.println(testTaxi2.isDiscountApplied());
        System.out.println(testTaxi2.getTollFee());
        System.out.println("-----------");*/
        /*System.out.println("--- Testing method on Truck objects ---");
        Truck testTruck1 = new Truck("7645MX", 10.50, 3, 7, true);
        boolean validLicensePlate = testTruck1.validateLicensePlate();
        System.out.println(validLicensePlate);
        System.out.println("-----------");
        Truck testTruck2 = new Truck("7645PX", 10.50, 3, 7, true);
        validLicensePlate = testTruck2.validateLicensePlate();
        System.out.println(validLicensePlate);
        System.out.println("-----------");
        Truck testTruck3 = new Truck("7645LX", 10.50, 3, 4, true);
        validLicensePlate = testTruck3.validateLicensePlate();
        System.out.println(validLicensePlate);
        System.out.println("-----------");
        Truck testTruck4 = new Truck("7645L9", 10.50, 3, 4, true);
        validLicensePlate = testTruck4.validateLicensePlate();
        System.out.println(validLicensePlate);
        System.out.println("-----------");
        Truck testTruck5 = new Truck("7645L9", 10.50, 3, 4, false);
        validLicensePlate = testTruck5.validateLicensePlate();
        System.out.println(validLicensePlate);
        System.out.println("-----------");
        Truck testTruck6 = new Truck("7645PX", 10.50, 3, 7, false);
        validLicensePlate = testTruck6.validateLicensePlate();
        System.out.println(validLicensePlate);*/
        System.out.println("--------- TEST 1 ---------");
        System.out.println("---- non-electric Taxi ---");
        System.out.println("--------------------------");
        Taxi t1 = new Taxi("JMD645", 10.0, 1, false, 5.0); // not electric
        t1.applyDiscount();
        System.out.println("discount already applied? " + t1.isDiscountApplied());
        System.out.println("toll fee: " + t1.getTollFee());
        System.out.println("total fare collected: " + t1.getFareCollected());
        System.out.println("total passengers: " + t1.getPassengers());
        if (!t1.isDiscountApplied() && t1.getTollFee() == 10.0 && t1.getFareCollected() == 5.0 && t1.getPassengers() == 1) {
          System.out.println("------------------------ TEST 1a PASS!");
        } else {
          System.out.println("------------------------ !!!!!!!!!!!!!!!TEST 1a FAIL!!!!!!!!!!!!!!!!!! ---");
        }
        t1.pickupRiders(2, 3.75);
        System.out.println("discount already applied? " + t1.isDiscountApplied());
        System.out.println("toll fee: " + t1.getTollFee());
        System.out.println("total fare collected: " + t1.getFareCollected());
        System.out.println("total passengers: " + t1.getPassengers());
        if (!t1.isDiscountApplied() && t1.getTollFee() == 10.0 && t1.getFareCollected() == 12.5 && t1.getPassengers() == 3) {
          System.out.println("------------------------ TEST 1b PASS!");
        } else {
          System.out.println("------------------------ !!!!!!!!!!!!!!!TEST 1b FAIL!!!!!!!!!!!!!!!!!! ---");
        }
        t1.pickupRiders(2, 5.90);
        System.out.println("discount already applied? " + t1.isDiscountApplied());
        System.out.println("toll fee: " + t1.getTollFee());
        System.out.println("total fare collected: " + t1.getFareCollected());
        System.out.println("total passengers: " + t1.getPassengers());
        if (t1.isDiscountApplied() && t1.getTollFee() == 5.0 && t1.getFareCollected() == 24.3 && t1.getPassengers() == 5) {
          System.out.println("------------------------ TEST 1c PASS!");
        } else {
          System.out.println("------------------------ !!!!!!!!!!!!!!!TEST 1c FAIL!!!!!!!!!!!!!!!!!! ---");
        }
        t1.pickupRiders(3, 3.40);
        System.out.println("discount already applied? " + t1.isDiscountApplied());
        System.out.println("toll fee: " + t1.getTollFee());
        System.out.println("total fare collected: " + t1.getFareCollected());
        System.out.println("total passengers: " + t1.getPassengers());
        if (t1.isDiscountApplied() && t1.getTollFee() == 5.0 && t1.getFareCollected() == 34.5 && t1.getPassengers() == 8) {
          System.out.println("------------------------ TEST 1d PASS!");
        } else {
          System.out.println("------------------------ !!!!!!!!!!!!!!!TEST 1d FAIL!!!!!!!!!!!!!!!!!! ---");
        }
        System.out.println("\n--------- TEST 2 ---------");
        System.out.println("----- electric Taxi ------");
        System.out.println("--------------------------");
        Taxi t2 = new Taxi("KCD123", 25, 1, true, 6.0); // electric
        t2.applyDiscount();
        System.out.println("discount already applied? " + t2.isDiscountApplied());
        System.out.println("toll fee: " + t2.getTollFee());
        System.out.println("total fare collected: " + t2.getFareCollected());
        System.out.println("total passengers: " + t2.getPassengers());
        if (t2.isDiscountApplied() && t2.getTollFee() == 12.5 && t2.getFareCollected() == 6.0 && t2.getPassengers() == 1) {
          System.out.println("------------------------ TEST 2a PASS!");
        } else {
          System.out.println("------------------------ !!!!!!!!!!!!!!!TEST 2a FAIL!!!!!!!!!!!!!!!!!! ---");
        }
        t2.pickupRiders(2, 3.7);
        System.out.println("discount already applied? " + t2.isDiscountApplied());
        System.out.println("toll fee: " + t2.getTollFee());
        System.out.println("total fare collected: " + t2.getFareCollected());
        System.out.println("total passengers: " + t2.getPassengers());
        if (t2.isDiscountApplied() && t2.getTollFee() == 12.5 && t2.getFareCollected() == 13.4 && t2.getPassengers() == 3) {
          System.out.println("------------------------ TEST 2b PASS!");
        } else {
          System.out.println("------------------------ !!!!!!!!!!!!!!!TEST 2b FAIL!!!!!!!!!!!!!!!!!! ---");
        }
        t2.pickupRiders(2, 4.75);
        System.out.println("discount already applied? " + t2.isDiscountApplied());
        System.out.println("toll fee: " + t2.getTollFee());
        System.out.println("total fare collected: " + t2.getFareCollected());
        System.out.println("total passengers: " + t2.getPassengers());
        if (t2.isDiscountApplied() && t2.getTollFee() == 12.5 && t2.getFareCollected() == 22.9 && t2.getPassengers() == 5) {
          System.out.println("------------------------ TEST 2c PASS!");
        } else {
          System.out.println("------------------------ !!!!!!!!!!!!!!!TEST 2c FAIL!!!!!!!!!!!!!!!!!! ---");
        }        
    }
}