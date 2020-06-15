package classWork;

import java.util.ArrayList;
import java.util.List;

public class Bar {
    public static void main(String[] args) {
        Person dmitriy = new Friends("Dmitriy", "Tarasov", 28);
        Person sergy = new Friends("Sergey", "Frolov", 30);
        Person oleg = new Friends("Oleg", "Probey", 17);
        Person olga = new Girls("Olga", "Kopeyko", 32);
        Person lybka = new Girls("Lybov", "Smirnova", 20);

        List <Person>party = new ArrayList<>();

        party.add(dmitriy);
        party.add(sergy);
        party.add(oleg);
        party.add(olga);
        party.add(lybka);

        for (Person person : party) {
            boolean fit = person.getAge() < 18;
            if (fit){
                System.out.println(person.getName() + " тебе нельзя!");
            }
        }
        for (Person person : party) {
            boolean name = person.getName().contains("Lybov");
            if (name){
                System.out.println(person);
            }
        }


    }
}



// 1. Класс Person (Имя, Фамилия, возраст)
//         2. Девушки и Друзья
//         (2 класса)
//         toString
//         «Имя: Подожди мне надо накраситься»
//         toString -> «Имя:Погнали мужики!»
//         3. Мы их всех зовем в бар
//         Класс Bar psvm
//         Составляем список
//         Добавляем туда друзей и подруг
//         4. Надо вывести всех кому нет 18
//         Написать к сожалению вам нельзя
//         5. Выведем всех кроме Люб
//         6. PersonComparator
//         compareTo
//         7* Вынести список друзей в отдельный класс FriendsList
