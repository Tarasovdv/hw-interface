package collections;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person dmitriy = new Men("Dmitriy",28,"male");
        Person natan = new Men("Natan",17,"male");
        Person nick = new Men("Nick",18,"male");
        Person olga = new Woman("Olga",32,"female");
        Person mary = new Woman("Mary",28,"female");


        List<Object> persons = new ArrayList<>();

        persons.add(dmitriy);
        persons.add(natan);
        persons.add(nick);
        persons.add(olga);
        persons.add(mary);

        printList(persons);
        for (Object o: persons) {


        }



    }

    private static void printList (List<Object> men){
        for (Object m:men) {
            System.out.println(m);

        }
    }



}
