package U9T5;
import java.util.ArrayList;

public class Vet {
    private String vetName;
    private ArrayList<Animal> animalList;

    public Vet(String vetName){
        this.vetName = vetName;
        animalList = new ArrayList<>();
    }

    public boolean addClient(Animal animal){
        boolean foundAnimal = false;
        for(Animal currentAnimal : animalList){
            if(currentAnimal == animal){
                foundAnimal = true;
                System.out.println(animal.getName() + " is already a client of " + vetName);
                break;
            }
        }
        if(foundAnimal == false){
            animalList.add(animal);
            System.out.println("Welcome to " + vetName + "'s office, " + animal.getName());
        }
        return !foundAnimal;
    }

    public void printClientList(){
        for(Animal currentAnimal : animalList){
            System.out.println(currentAnimal.getName() + ": " + currentAnimal.getClass());
        }
    }
}
