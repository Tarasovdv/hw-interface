package hero;

import interface_oop.Flyable;
import interface_oop.RunRunnable;
import interface_oop.Swimable;
import interface_oop.Walkable;

public class Man implements Walkable, Swimable, Flyable, RunRunnable {

    @Override
    public void fly() {
        System.out.println("Only on aircraft.");

    }

    @Override
    public String sing() {
        String message = "Sing very good.";
        return message;

    }

    @Override
    public void swim() {
        System.out.println("They don't swim well.");

    }

    @Override
    public double maxSwimSpeed() {
        return 6;
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
        return 150;
    }
}
