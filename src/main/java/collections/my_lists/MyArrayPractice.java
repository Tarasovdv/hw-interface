package collections.my_lists;

import java.util.Arrays;

public class MyArrayPractice {
    public static void main(String[] args) {
        MyArrayList myList = new MyArrayList();
        myList.add("A1");
        myList.add("A2");
        myList.add("A3");
        myList.add("A4");
        myList.add("A5");
        myList.add("A6");
        myList.add("A7");
        myList.add("A8");
        myList.add("A9");
        myList.add("A10");
        myList.add("A11");


//        System.out.println(myList);
        System.out.println(myList.size());
//        System.out.println(myList.get(10));
//        //System.out.println(myList.get(11));
//        //System.out.println(myList.get(-1));

        System.out.println(myList);
        System.out.println(myList.subList(0, 3));
        System.out.println("myList.isEmpty() = " + myList.isEmpty());

        System.out.println("myList.contains(\"A1\") = " + myList.contains("A1"));
        //System.out.println("myList.contains(\"A100\") = " + myList.contains("A100")); //NullPointerException ???

//        myList.clear();
//        System.out.println("myList After Clear = " + myList);

//        myList.set(3,"234");
//        System.out.println("myList = " + myList);

//        myList.add(10,"123");
//        System.out.println("myList = " + myList); //???

        myList.remove(2);
        System.out.println("myList = " + myList);

        System.out.println("myList.indexOf(\"A5\") = " + myList.indexOf("A5"));

        System.out.println("myList.lastIndexOf(\"A11\") = " + myList.lastIndexOf("A5")); //NullPointerException ???


    }
}
