package U9T5;
import java.util.ArrayList;

public class AnimalRunner {
    public static void main(String[] args) {
        Animal thing = new Animal("Thing");
        Puppy spot = new Puppy("Spot");
        Cow marge = new Cow("Marge");
        Dog penny = new Dog("Penny");
        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(thing);
        animalList.add(spot);
        animalList.add(marge);
        animalList.add(penny);
        for(Animal animal : animalList){
            System.out.println(animal.getName());
        }
        Animal[] animalArray = {spot, marge, thing, penny};
        for(int i = 0; i < animalArray.length; i ++){
            if(animalArray[i] instanceof Cow){
                Cow confirmedCow = (Cow) animalArray[i];
                confirmedCow.milk();
            }
        }
        Vet Jia = new Vet("Jia");
        for(Animal animal : animalList){
             System.out.println(Jia.addClient(animal));
        }
        for(Animal animal : animalList){
            System.out.println(Jia.addClient(animal));
       }
       Animal animal = new Animal("Thing");
       Puppy puppy = new Puppy("Spot");
       Cow cow = new Cow("Marge");
       Dog dog = new Dog("Penny");
       
       Vet vet = new Vet("Turin");
       System.out.println("----> Adding each client (successful):");
       System.out.println(vet.addClient(animal));
       System.out.println(vet.addClient(puppy));
       System.out.println(vet.addClient(cow));
       System.out.println(vet.addClient(dog));
       System.out.println("----> Adding each client again (unsuccessful):");
       System.out.println(vet.addClient(animal));
       System.out.println(vet.addClient(puppy));
       System.out.println(vet.addClient(cow));
       System.out.println(vet.addClient(dog));
       System.out.println("----------> PRINTING CLIENT LIST <----------");
       vet.printClientList();
    }
}
