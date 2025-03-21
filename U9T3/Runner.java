package U9T3;

public class Runner {
    public static void main(String[] args) {

        Agent maria = new Agent("Maria Hilliard", "917-221-3451");
        Dancer tony = new Dancer("Tony Danza", 32, maria, 11);
        System.out.println(tony.getName()); // call overridden method
    }
}
