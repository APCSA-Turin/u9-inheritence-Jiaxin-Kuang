import java.util.ArrayList;

public class Runner{
    public static void main(String[] args) {
        ShippingItem myItem = new ShippingItem(10);
        System.out.println(myItem.getWeight());
        System.out.println(myItem.getCost());
        ShippingItem insItem = new InsuredShippingItem(10, 50);
        System.out.println(insItem instanceof InsuredShippingItem);
        System.out.println(((InsuredShippingItem) insItem).getInsuredAmount());
        System.out.println(insItem.getWeight());
        ShippingItem newItem = new InsuredShippingItem(10, 50);
        System.out.println(newItem.getCost());
        ArrayList<ShippingItem> itemList = new ArrayList<>();
        itemList.add(new ShippingItem(10));
        itemList.add(new InsuredShippingItem(20, 50));
        itemList.add(new ShippingItem(30));
        itemList.add(new InsuredShippingItem(50, 70));
        double totalCost = 0;

        for (ShippingItem item : itemList) {
          totalCost += item.getCost();
        }
    
        for (ShippingItem item : itemList) {
            if(item instanceof InsuredShippingItem){
                ((InsuredShippingItem)item).addMoreInsurance(30);
                totalCost += item.getCost();
            }
        }
    
        System.out.println(totalCost);
    }
}