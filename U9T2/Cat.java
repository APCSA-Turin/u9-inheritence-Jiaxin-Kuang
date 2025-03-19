public class Cat extends Animal {
    private boolean played = false;

    public Cat(String name, int age, boolean vaccinated){
        super(name, age, vaccinated);
    }

    public void play(){
        played = true;
    }

    public boolean hasPlayedWith(){
        return played;
    }
}
