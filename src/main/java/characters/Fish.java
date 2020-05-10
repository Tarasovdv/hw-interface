package characters;

import interface_oop.Flyable;
import interface_oop.Run_Runnable;
import interface_oop.Swimable;
import interface_oop.Walkable;

public class Fish implements Walkable, Swimable, Flyable, Run_Runnable {
    @Override
    public void fly() {
        System.out.println("Some are able to fly.");

    }

    @Override
    public String sing() {
        String message = "Silent as fish.";
        return message;
    }

    @Override
    public void swim() {
        System.out.println("This is their main job.");

    }

    @Override
    public double maxSwimSpeed() {
        return 78;
    }

    @Override
    public void walk() {
        System.out.println("Not walk.");

    }


    @Override
    public void run() {
        System.out.println("Not to run.");

    }

    @Override
    public int maxRunDistance() {
        return 0;
    }
}
