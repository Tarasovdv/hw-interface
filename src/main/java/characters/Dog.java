package characters;

import interface_oop.Flyable;
import interface_oop.Run_Runnable;
import interface_oop.Swimable;
import interface_oop.Walkable;

public class Dog implements Walkable, Swimable, Flyable, Run_Runnable {
    @Override
    public void fly() {
        System.out.println("Only to space.");

    }

    @Override
    public String sing() {
        String message = "Sing wowf.";
        return message;

    }

    @Override
    public void swim() {
        System.out.println("They don't swim well.");

    }

    @Override
    public double maxSwimSpeed() {
        return 6.5;
    }

    @Override
    public void walk() {
        System.out.println("They love to walk.");

    }

    @Override
    public void run() {
        System.out.println("They run well.");

    }

    @Override
    public int maxRunDistance() {
        return 5;
    }
}
