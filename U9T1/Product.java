public class Product {
    private int discount;
    private String name;
    private double basePrice;
    private int yearReleased;
    
    public Product(int discount, String name, double basePrice, int yearReleased){
        this.discount = discount;
        this.name = name;
        this.basePrice = basePrice;
        this.yearReleased = yearReleased;
    }

    public String getName(){
        return name;
    }

    public int getDiscount(){
        return discount;
    }

    public double getBasePrice(){
        return basePrice;
    }

    public int yearReleased(){
        return yearReleased;
    }

    public void info(){
        System.out.println(name + " released on " + yearReleased + " has a base price of " + basePrice + " and discount of " + discount + "%");
    }

    public void buyProduct(){
        double costAfterDiscount = basePrice - (basePrice * discount/100);
        System.out.println("You bought " + name + " for $" + costAfterDiscount);
    }
}
