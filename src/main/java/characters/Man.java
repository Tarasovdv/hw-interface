package characters;

import interface_oop.Walkable;

public class Man implements Walkable {
    @Override
    public void walk(){
        System.out.println("I Love Walking");
    }
}
