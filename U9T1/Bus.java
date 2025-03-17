public class Bus extends Vehicle {
    private int maxCapacity; 
    private int currentCapacity; 

    public Bus(String name, int wheels, int maxCapacity, int currentCapacity){
        super(name, wheels);
        this.maxCapacity = maxCapacity;
        this.currentCapacity = currentCapacity;
    }

    public int getMaxCapacity(){
        return maxCapacity;
    }

    public int getCurrentCapacity(){
        return currentCapacity;
    }

    public void newPassenger(int people){
        System.out.println(people + " boarded");
        currentCapacity += people;
    }

    public void leavePassenger(int people){
        System.out.println(people + " got off");
        currentCapacity -= people;
    }
}
