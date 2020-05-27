package collections;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        Person dmitriy = new Men("Dmitriy", 26, "male");
        Person natan = new Men("Natan", 19, "male");
        Person nick = new Men("Nick", 17, "male");
        Person olga = new Woman("Olga", 32, "female");
        Person mary = new Woman("Mary", 28, "female");


        List<Person> persons = new ArrayList<>();

        persons.add(dmitriy);
        persons.add(natan);
        persons.add(nick);
        persons.add(olga);
        persons.add(mary);
//        boolean name = natan.getName().matches("[N].*");
//        System.out.println(name);

        //printList(persons);
        for (Person o : persons) {
            boolean fit = o.getAge() < 27 && o.getAge() > 17;
            boolean men = o.getSex().contains("male");
            boolean name = o.getName().matches("[N].*");
            int middleAge;
            if (fit && men && name) {
                System.out.println(o);
            }
        }

        double average = 0;

        int sum = 0;
        int contain = 0;
        for (Person o : persons) {
            boolean woman = o.getSex().contains("female");
            if (woman) {
                sum += o.getAge();
                contain++;
            }
        }
        System.out.println("Middle age woman: " + sum / contain);


    }

    private static void printList(List<Person> person) {
        for (Object p : person) {
            System.out.println(p);

        }
    }


}
