package characters;

import interface_oop.Flyable;
import interface_oop.Run_Runnable;
import interface_oop.Swimable;
import interface_oop.Walkable;

public class Bird implements Walkable, Swimable, Flyable, Run_Runnable {

    @Override
    public void fly() {
        System.out.println("Сan fly. The best in the business.");
    }

    @Override
    public String sing() {
        String message = "Sings beautifully";
        return message;
    }

    @Override
    public void swim() {
        System.out.println("Almost all birds swim.");

    }

    @Override
    public double maxSwimSpeed() {
        return 40;
    }

    @Override
    public void walk() {
        System.out.println("They love to walk.");

    }


    @Override
    public void run() {
        System.out.println("They run badly.");
    }

    @Override
    public int maxRunDistance() {
        return 100;
    }
}
