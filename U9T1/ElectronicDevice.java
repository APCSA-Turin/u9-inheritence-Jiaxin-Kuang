public class ElectronicDevice extends Product{
    private int RAM;
    private String storage;

    public ElectronicDevice(int discount, String name, int basePrice, int yearReleased, int RAM, String storage){
        super(discount, name, basePrice, yearReleased);
        this.RAM = RAM;
        this.storage = storage;
    }

    public int getRAM(){
        return RAM;
    }

    public String getStorage(){
        return storage;
    }
}