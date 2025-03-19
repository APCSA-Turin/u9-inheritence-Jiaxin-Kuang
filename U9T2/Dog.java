public class Dog extends Animal{
    private boolean walked = false;

    public Dog(String name, int age, boolean vaccinated){
        super(name, age, vaccinated);
    }

    public void walk(){
        walked = true;
    }

    public boolean hasBeenWalked(){
        return walked;
    }
}
