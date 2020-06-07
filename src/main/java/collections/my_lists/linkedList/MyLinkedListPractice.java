package collections.my_lists.linkedList;

public class MyLinkedListPractice {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        System.out.println("linkedList.size() = " + linkedList.size());
        linkedList.add("Vitaliy");
        System.out.println(linkedList.toString());
        linkedList.add("Maxim");
        linkedList.add("Dmitriy");
        System.out.println(linkedList);

        linkedList.remove("Vitaliy");
        System.out.println(linkedList);

        System.out.println(linkedList.contains("Dmitriy"));

//        System.out.println("After clear:");
//        linkedList.clear();
//        System.out.println(linkedList);

        linkedList.set(0, "Olga");
        System.out.println(linkedList);

        linkedList.add(1, "Mary");
        System.out.println(linkedList);

        linkedList.remove(2);
        System.out.println(linkedList);

        System.out.println(linkedList.indexOf("Olga"));


    }
}
