package collections.set.hw;

import collections.Person;
import collections.map.Human;
import collections.set.Glass;

import javax.swing.*;
import java.util.*;

public class FruitShop {
    public static void main(String[] args) {

        Set<Fruit> fruits = new HashSet<>();

        Fruit banana = new Fruit("Banana", 250.25);
        Fruit orange = new Fruit("Orange", 200);
        Fruit kivi = new Fruit("Kivi", 100);
        Fruit apple = new Fruit("Apple", 150);
        Fruit pineapple = new Fruit("Pineapple", 400);


        People dmitriy = new People("Dmitriy");
        People olga = new People("Olga");
        People viktor = new People("Viktor");
        People vika = new People("Viktoria");
        People mary = new People("Marya");
        People semen = new People("Semen");
        People lena = new People("Elena");
        People vladimir = new People("Vladimir");


        fruits.add(banana);
        fruits.add(orange);
        fruits.add(kivi);
        fruits.add(banana);
        fruits.remove(orange);
        System.out.println("fruits.contains(kivi) = " + fruits.contains(kivi));

        for (Fruit fr : fruits) {
            System.out.println(fr);
        }

        System.out.println("\nAfter Iterator: ");
        Iterator iterator = fruits.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "\n");
        }


        Map<People, Fruit> peopleFruitMap = new HashMap<>();


        peopleFruitMap.put(dmitriy, orange);
        peopleFruitMap.put(olga, kivi);
        peopleFruitMap.put(semen, kivi);
        peopleFruitMap.put(vika, kivi);
        peopleFruitMap.put(viktor, apple);
        peopleFruitMap.put(mary, apple);
        peopleFruitMap.put(lena, pineapple);
        peopleFruitMap.put(vladimir,kivi);

//        peopleFruitMap.remove(dmitriy,orange);
//        peopleFruitMap.remove(dmitriy);

//        peopleFruitMap.entrySet().removeIf(entry -> entry.getValue().equals(apple));
        System.out.println("\npeopleFruitMap.containsKey(lena) = " + peopleFruitMap.containsKey(lena));
        System.out.println("\npeopleFruitMap.containsValue(kivi) = " + peopleFruitMap.containsValue(kivi));


        Map<People, Fruit> peopleFruitMapSecond = new HashMap<>(peopleFruitMap);




        System.out.println("\n Map pairs: ");
        for (Map.Entry<People, Fruit> pair : peopleFruitMap.entrySet()) {
            System.out.println(pair.getKey().getName() + " " + pair.getValue());
        }

//        System.out.println("\n Map Keys: ");
//        for (Map.Entry<People, Fruit> pair : peopleFruitMap.entrySet()) {
//            System.out.println(pair.getKey().getName());
//        }
//
//        System.out.println("\n Map Values: ");
//        for (Map.Entry<People, Fruit> pair : peopleFruitMap.entrySet()) {
//            System.out.println(pair.getValue());
//        }


//        System.out.println("\npeopleFruitMap.get(\"Olga\") = " + peopleFruitMap.get(olga));

//        System.out.println("\n Second Map pairs: ");
//        for (Map.Entry<People, Fruit> pair : peopleFruitMapSecond.entrySet()) {
//            System.out.println(pair.getKey().getName() + " " + pair.getValue());
//        }


        System.out.println("\n");
        Iterator<Map.Entry<People, Fruit>> it = peopleFruitMap.entrySet().iterator();

//        int contain = 0;
//        while (it.hasNext()) {
//            Map.Entry<People, Fruit> pair = it.next();
//            if (pair.getKey().getName().length() > 5){
//                contain++;
//            }
//        }
//        System.out.println("Количество имен в которых больше 5 букв: "+ contain);
//
//
//        int contain = 0;
//        while (it.hasNext()) {
//            Map.Entry<People, Fruit> pair = it.next();
//            if (pair.getValue().getTitle().equals("Kivi")){
//                contain++;
//            }
//        }
//        System.out.println("Количество Kivi: "+ contain);


//        System.out.println("\nВывод фруктов пропустив 2 Kivi: ");
//        int contain = 0;
//        while (it.hasNext()) {
//            Map.Entry<People, Fruit> pair = it.next();
//            if (!(pair.getValue().getTitle().equals("Kivi")) || contain == 2) {
//                System.out.println(pair.getValue().getTitle());
//            } else if (pair.getValue().getTitle().equals("Kivi")){
//                contain++;
//            }
//        }

//        System.out.println("\nВсе кроме 2 элементов, ключи которых начинаются на V:  ");
//        int contain = 0;
//        while (it.hasNext()) {
//            Map.Entry<People, Fruit> pair = it.next();
//            if (!(pair.getKey().getName().matches("[V].*")) || contain == 2) {
//                System.out.println(pair.getKey().getName());
//            } else if (pair.getKey().getName().matches("[V].*")){
//                contain++;
//            }
//        }

//        System.out.println("\n Возвращаем элемент значение которого kivi или Kivi или KIVi. :  ");
//        while (it.hasNext()) {
//            Map.Entry<People, Fruit> pair = it.next();
//            if ((pair.getValue().getTitle().equalsIgnoreCase("kiVi"))) {
//                System.out.println(pair.getValue().getTitle());
//                break;
//            }
//        }


//        System.out.println("\n Middle weight fruits:  ");
//        int sum = 0;
//        int contain = 0;
//        while (it.hasNext()) {
//            Map.Entry<People, Fruit> pair = it.next();
//           sum+=pair.getValue().getWeight();
//           contain++;
//        }
//        System.out.println("Middle weight fruits: " + (double)sum / contain);



    }
}
