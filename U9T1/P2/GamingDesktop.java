package P2;

public class GamingDesktop extends Desktop {
    String graphicCard;
    public GamingDesktop(int screenSize, int memory, String graphicCard) {
        super(screenSize, memory, true);
        this.graphicCard = graphicCard;
    }

    public String getGraphicCard(){
        return graphicCard;
    }

    public void setGraphicCard(String newGraphicCard){
        graphicCard = newGraphicCard;
    }
    
    public void updateDrivers() {
        System.out.println("Graphic card drivers have been updated");
    }
}