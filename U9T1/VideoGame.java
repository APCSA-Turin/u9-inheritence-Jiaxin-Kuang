public class VideoGame extends Product {
    private String genre;
    private int playerCount;

    public VideoGame(int discount, String name, int basePrice, int yearReleased, String genre, int playerCount){
        super(discount, name, basePrice, yearReleased);
        this.playerCount = playerCount;
        this.genre = genre;
    }

    public String getGenre(){
        return genre;
    }

    public int getPlayerCount(){
        return playerCount;
    }
}