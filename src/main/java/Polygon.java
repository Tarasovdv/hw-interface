import characters.*;
import interface_oop.Flyable;
import interface_oop.Run_Runnable;
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
                    bird();
                    break;
                case 2:
                    fish();
                    break;
                case 3:
                    cat();
                    break;
                case 4:
                    dog();
                    break;
                case 5:
                    man();
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

    private static void man() {
        System.out.println("Man");
        printMenuInterfaces();
        interfaces("man");
    }

    private static void dog() {
        System.out.println("Dog");
        printMenuInterfaces();
        interfaces("dog");
    }

    private static void cat() {
        System.out.println("Cat");
        printMenuInterfaces();
        interfaces("cat");
    }

    private static void fish() {
        System.out.println("Fish");
        printMenuInterfaces();
        interfaces("fish");
    }

    public static void bird() {
        System.out.println("Bird");
        printMenuInterfaces();
        interfaces("bird");

    }

    public static void interfaces(String character) {
        Scanner console = new Scanner(System.in);
        int consoleInterfaces;
        while ((consoleInterfaces = console.nextInt()) != 0) {
            switch (consoleInterfaces) {
                case 1:
                    swimable(character);
                    break;
                case 2:
                    flyable(character);
                    break;
                case 3:
                    walkable(character);
                    break;
                case 4:
                    runnable(character);

            }
        }
    }


    private static void runnable(String character) {
        Run_Runnable ytka = new Bird();
        Run_Runnable dori = new Fish();
        Run_Runnable barsik = new Cat();
        Run_Runnable tuzik = new Dog();
        Run_Runnable rich = new Man();
        if ("bird".equals(character)) {
            ytka.run();
            System.out.println("Max run distance: " + ytka.maxRunDistance() + " meter");
        } else if ("cat".equals(character)) {
            barsik.run();
            System.out.println("Max run distance: " + barsik.maxRunDistance() + " kilometer");

        } else if ("fish".equals(character)) {
            dori.run();
            System.out.println("Max run distance: " + dori.maxRunDistance() + " meter");

        } else if ("dog".equals(character)) {
            tuzik.run();
            System.out.println("Max run distance: " + tuzik.maxRunDistance() + " kilometer");

        } else if ("man".equals(character)) {
            rich.run();
            System.out.println("Max run distance: " + rich.maxRunDistance() + " kilometer");

        }

    }

    private static void walkable(String character) {
        Walkable ytka = new Bird();
        Walkable dori = new Fish();
        Walkable barsik = new Cat();
        Walkable tuzic = new Dog();
        Walkable rich = new Man();
        if ("bird".equals(character)) {
            ytka.walk();
        } else if ("cat".equals(character)) {
            barsik.walk();
        } else if ("fish".equals(character)) {
            dori.walk();
        } else if ("dog".equals(character)) {
            tuzic.walk();
        } else if ("man".equals(character)) {
            rich.walk();
        }
    }

    private static void flyable(String character) {
        Flyable ytka = new Bird();
        Flyable dori = new Fish();
        Flyable barsik = new Cat();
        Flyable tuzic = new Dog();
        Flyable rich = new Man();
        if ("bird".equals(character)) {
            ytka.fly();
            System.out.println(ytka.sing());
        } else if ("cat".equals(character)) {
            barsik.fly();
            System.out.println(barsik.sing());

        } else if ("fish".equals(character)) {
            dori.fly();
            System.out.println(dori.sing());

        } else if ("dog".equals(character)) {
            tuzic.fly();
            System.out.println(tuzic.sing());

        } else if ("man".equals(character)) {
            rich.fly();
            System.out.println(rich.sing());

        }

    }

    private static void swimable(String character) {
        Swimable ytka = new Bird();
        Swimable barsik = new Cat();
        Swimable dori = new Fish();
        Swimable tuzic = new Dog();
        Swimable rich = new Man();
        if ("bird".equals(character)) {
            ytka.swim();
            System.out.println("Max swim Speed: " + ytka.maxSwimSpeed() + " km/h");
        } else if ("cat".equals(character)) {
            barsik.swim();
            System.out.println("Max swim Speed: " + barsik.maxSwimSpeed() + " km/h");
        } else if ("fish".equals(character)) {
            dori.swim();
            System.out.println("Max swim Speed: " + dori.maxSwimSpeed() + " km/h");
        } else if ("dog".equals(character)) {
            tuzic.swim();
            System.out.println("Max swim Speed: " + tuzic.maxSwimSpeed() + " km/h");
        } else if ("man".equals(character)) {
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
