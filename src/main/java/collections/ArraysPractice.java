package collections;

import java.util.List;
import java.util.ArrayList;

public class ArraysPractice {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();

        myList.add(1);

        System.out.println(myList.get(0));
        myList.add(0, 2);
        System.out.println(myList.get(0));

        myList.add(0, 7);
        myList.add(1, -1);

        System.out.println("MyList:");
        for (int i = 0; i < myList.size(); i++) {
            System.out.print(" " + myList.get(i));

        }
        System.out.println("\n");

        for (Integer el : myList) {
            System.out.print(el + " ");

        }


        System.out.println(myList.contains(2));

        if (myList.contains(2)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        myList.remove(0); //удаление по индексу

        printList(myList);
        myList.remove(Integer.valueOf(2)); // удаление по значению
        printList(myList);

        myList.add(1);
        myList.add(1);
        myList.add(1);
        myList.add(1);
        printList(myList);

        System.out.println(myList.indexOf(1)); // вывод индекса
        System.out.println(myList.lastIndexOf(1));// вывод последнего индекса


        System.out.println("After set");
        myList.set(1, 5);
        printList(myList);


        myList.set(myList.size() - 1, 77);
        printList(myList);


        System.out.println("Class Work: ");

//0
        System.out.println("Task #0");
        List<String> emptyArray = new ArrayList<>();
        List<String> array = new ArrayList<>(10);
//1
        System.out.println("Task #1");
        array.add("Dmitriy");
        array.add("Olga");
        array.add("Nick");
        array.add("Jack");
        array.add("Jason");
        array.add("Natan");
        array.add("Olga");
        printArray(array);

        System.out.println(array.get(0));
        System.out.println(array.get(array.size() - 1));
//2
        System.out.println("Task #2");
        array.add(2, array.get(5));
        array.add(0, array.get(7));
        printArray(array);

        List<String> arrayNew = new ArrayList<>(array.size());
        arrayNew.addAll(array);
        System.out.println("Array New: ");
        printArray(arrayNew);

        System.out.println("Task #3");
        array.remove("Dmitriy");
        array.remove(3);
        printArray(array);

        System.out.println("Task #4");
        System.out.println("array.contains(\"Natan\") = " + array.contains("Natan"));

        System.out.println("Task #6");
        System.out.println("In every third position there are names:");
        for (int i = 0; i < array.size(); i += 3) {
            System.out.print(" " + array.get(i));
        }

        int contain = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).contains("Olga")) {
                contain++;
            }
        }
        System.out.println("\nThere are " + contain + " positions in the list with the name Olga.");

        System.out.println("Task #7");
        for (int i = 3; i < array.size(); i++) {
            System.out.print(" " + array.get(i));
        }


        System.out.println("\n\nTask #7B");
        array.add(0, "Olga");
        printArray(array);
        contain = 0;
        for (String s : array) {
            if (!(s.contains("Olga")) || (contain == 2)) {
                System.out.print(s + " ");

            } else if (s.contains("Olga")) {
                contain++;
            }
        }

        System.out.println("\n\nTask #8");
        List<Integer> num = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            num.add(i, i);
        }
        printList(num);
        for (Integer integer : num) {
            if ((integer % 3) == 0 && integer != 0) {
                System.out.println(integer);
                break;
            }
        }

        System.out.println("\n\nTask #9");
        for (Integer integer : num) {
            if ((integer % 3) == 0 && integer != 0) {
                System.out.print(integer + " ");
                //break;
            }
        }

    }


//        0. Содание списков: (Используя конструктор)
//        а). Создать пустой список
//        б). Создать список размером 20
//
//        1. Получить элемент по индексу:
//        а). Получить первый элемент
//        б). Получить последний элемент
//
//        2. Задачи на вставку элемента:
//        а) Добавить подряд 5 элементов.
//        б) Добавить шестой элемент в третию позицию. Добавить седьмой элемент в первую позицию.
//        в) Записать в новый список все элементы предыдущего списка.
//
//        3. Задачи на удаление элементов: (Используя методы)
//        а) Удалить элемент по значению
//        б) Удалить элемент по индексу
//
//       4. Проверить наличие элемента
//
//        5. Вывод списка:
//        а) Вывести список на экран в формате: List: {"First";"Second";"Third"}
//
//        6. Отфильтровать список вернуть записи по некоторому условию:
//        а) Условие на индекс: Индекс делится на 3
//        б) Условие на значение: Вернуть количество элементов, которые равны "***"
//
//        7. Пропустить несколько первых элементов
//        а) Пропустить первые 3 элемента в списке.
//
//        6 + 7: Пропускаем элементы, которые удовлетворяют некоторому условию
//        а) Пропустить первые 2 элемента, которые равные "****"
//
//        8. Вернуть первый подходящий элемент:
//        а) Возращаем Первый элемент Делящийся на 3.
//
//        9. Возвращаем все элементы удовлетворяющие условию:
//        а) Возвращаем все элементы делящиеся на 3
//
//        10. Создать класс Person.
//        Вернуть всех военнообязанных мужчин (пол), которым меньше 27 и больше 18 и имя которых начинается на Н
//
//        11. Найти средний возраст всех женщин.


    private static void printList(List<Integer> myList) {
        for (Integer el : myList) {
            System.out.print(el + " ");

        }
        System.out.println();
    }

    private static void printArray(List<String> array) {
        System.out.print("List: { ");
        for (String el : array) {
            System.out.print(el + "; ");

        }
        System.out.println("}");
        System.out.println();
    }
}
