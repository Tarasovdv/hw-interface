import persons.*;
import interface_oop.Flyable;
import interface_oop.RunRunnable;
import interface_oop.Swimable;
import interface_oop.Walkable;
import presentation.Salary;
import presentation.Tiger;

import java.util.Scanner;

public class Polygon {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int inputConsole;
        System.out.println();
        printGreeting();
        printMenu();
        while ((inputConsole = console.nextInt()) != 0) {
            switch (inputConsole) {
                case 1:
                    printAbilityBird();
                    break;
                case 2:
                    printAbilityFish();
                    break;
                case 3:
                    printAbilityCat();
                    break;
                case 4:
                    printAbilityDog();
                    break;
                case 5:
                    printAbilityMan();
                    break;
                case 6:
                    presentation();
            }
            printMenu();
        }
        printFarewell();

        Vodka talka = new Vodka("Talka", 1.75, 40, "soft");
        System.out.println(talka);
        talka.drinkTooMuch("Anton", 5);
        talka.drinkTooMuch("Alexander");
    }

    private static void presentation() {
        Tiger sherkhan = new Tiger("Sherkhan", 430.5, 3.5, 8);
        System.out.println(sherkhan);
        Tiger kira = new Tiger("Kira");
        System.out.println(kira);
        sherkhan.sayTiger("Sherkhan", 8);
        kira.sayTiger("Kira");

        System.out.println("Salary: ");
        Salary dima = new Salary(85);
        System.out.println("Dmitriy: " + dima.getFullSalary());


    }

    private static void printAbilityMan() {
        System.out.println("Man");
        printMenuInterfaces();
        interfaces("man");
    }

    private static void printAbilityDog() {
        System.out.println("Dog");
        printMenuInterfaces();
        interfaces("dog");
    }

    private static void printAbilityCat() {
        System.out.println("Cat");
        printMenuInterfaces();
        interfaces("cat");
    }

    private static void printAbilityFish() {
        System.out.println("Fish");
        printMenuInterfaces();
        interfaces("fish");
    }

    public static void printAbilityBird() {
        System.out.println("Bird");
        printMenuInterfaces();
        interfaces("bird");

    }

    public static void interfaces(String persons) {
        Scanner console = new Scanner(System.in);
        int consoleInterfaces;
        while ((consoleInterfaces = console.nextInt()) != 0) {
            switch (consoleInterfaces) {
                case 1:
                    swimable(persons);
                    break;
                case 2:
                    flyable(persons);
                    break;
                case 3:
                    walkable(persons);
                    break;
                case 4:
                    runnable(persons);

            }
        }
    }


    private static void runnable(String persons) {
        RunRunnable ytka = new Bird();
        RunRunnable dori = new Fish();
        RunRunnable barsik = new Cat();
        RunRunnable tuzik = new Dog();
        RunRunnable rich = new Man();
        if ("bird".equals(persons)) {
            ytka.run();
            System.out.println("Max run distance: " + ytka.maxRunDistance() + " meter");
        } else if ("cat".equals(persons)) {
            barsik.run();
            System.out.println("Max run distance: " + barsik.maxRunDistance() + " kilometer");

        } else if ("fish".equals(persons)) {
            dori.run();
            System.out.println("Max run distance: " + dori.maxRunDistance() + " meter");

        } else if ("dog".equals(persons)) {
            tuzik.run();
            System.out.println("Max run distance: " + tuzik.maxRunDistance() + " kilometer");

        } else if ("man".equals(persons)) {
            rich.run();
            System.out.println("Max run distance: " + rich.maxRunDistance() + " kilometer");

        }

    }

    private static void walkable(String persons) {
        Walkable ytka = new Bird();
        Walkable dori = new Fish();
        Walkable barsik = new Cat();
        Walkable tuzic = new Dog();
        Walkable rich = new Man();
        if ("bird".equals(persons)) {
            ytka.walk();
        } else if ("cat".equals(persons)) {
            barsik.walk();
        } else if ("fish".equals(persons)) {
            dori.walk();
        } else if ("dog".equals(persons)) {
            tuzic.walk();
        } else if ("man".equals(persons)) {
            rich.walk();
        }
    }

    private static void flyable(String persons) {
        Flyable ytka = new Bird();
        Flyable dori = new Fish();
        Flyable barsik = new Cat();
        Flyable tuzic = new Dog();
        Flyable rich = new Man();
        if ("bird".equals(persons)) {
            ytka.fly();
            System.out.println(ytka.sing());
        } else if ("cat".equals(persons)) {
            barsik.fly();
            System.out.println(barsik.sing());

        } else if ("fish".equals(persons)) {
            dori.fly();
            System.out.println(dori.sing());

        } else if ("dog".equals(persons)) {
            tuzic.fly();
            System.out.println(tuzic.sing());

        } else if ("man".equals(persons)) {
            rich.fly();
            System.out.println(rich.sing());

        }

    }

    private static void swimable(String persons) {
        Swimable ytka = new Bird();
        Swimable barsik = new Cat();
        Swimable dori = new Fish();
        Swimable tuzic = new Dog();
        Swimable rich = new Man();
        if ("bird".equals(persons)) {
            ytka.swim();
            System.out.println("Max swim Speed: " + ytka.maxSwimSpeed() + " km/h");
        } else if ("cat".equals(persons)) {
            barsik.swim();
            System.out.println("Max swim Speed: " + barsik.maxSwimSpeed() + " km/h");
        } else if ("fish".equals(persons)) {
            dori.swim();
            System.out.println("Max swim Speed: " + dori.maxSwimSpeed() + " km/h");
        } else if ("dog".equals(persons)) {
            tuzic.swim();
            System.out.println("Max swim Speed: " + tuzic.maxSwimSpeed() + " km/h");
        } else if ("man".equals(persons)) {
            rich.swim();
            System.out.println("Max swim Speed: " + rich.maxSwimSpeed() + " km/h");
        }

    }

    public static void printGreeting() {
        System.out.println("\n______________________________________ Добро пожаловать на POLYGON! _________________________________________");
    }

    public static void printMenu() {
        System.out.println("\nMenu:\n" +
                "|   1  .   2  .  3  .  4  .  5  .    6    .   0  |\n" +
                "| Bird | Fish | Cat | Dog | Man | Present | Exit |");
    }

    public static void printMenuInterfaces() {
        System.out.println("\nMenu Interfaces:\n" +
                "|     1    .    2    .     3    .     4    .  0   |\n" +
                "| Swimable | Flyable | Walkable | Runnable | Back |");
    }


    public static void printFarewell() {
        System.out.println("\n___________________________________ Благодарим Вас за работу в POLYGON! _____________________________________");
        System.out.println("\n_______________________________________ THE PURSUIT OF PERFECTION ___________________________________________");
    }


}
