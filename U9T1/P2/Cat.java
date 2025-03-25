package P2;

import U9T5.Animal;

public class Cat extends Animal {
    private boolean played = false;

    public Cat(String name, int age, boolean vaccinated){
        super(name);
    }

    public void play(){
        played = true;
    }

    public boolean hasPlayedWith(){
        return played;
    }
}
