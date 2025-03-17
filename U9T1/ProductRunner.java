public class ProductRunner {
    public static void main(String[] args) {
        Product product = new Product(15, "Calbee Seaweed and Salt Potato Chips", 4, 1976);
        product.info();
        product.buyProduct();

        System.out.println("----------------------------------------------------------------------------------------");

        ElectronicDevice product1 = new ElectronicDevice(10, "Dell XPS 15", 1990, 2023, 16, "512 GB");
        product1.info();
        System.out.println("RAM: " + product1.getRAM() + " GB");
        System.out.println("Storage: " + product1.getStorage());
        product1.buyProduct();

        System.out.println("----------------------------------------------------------------------------------------");

        VideoGame product2 = new VideoGame(0, "Hello Kitty Island Adventure", 40, 2023, "Life simulation", 3965);
        product2.info();
        System.out.println("Genre: " + product2.getGenre());
        System.out.println("Player Count: " + product2.getPlayerCount());
        product2.buyProduct();
    }
}
