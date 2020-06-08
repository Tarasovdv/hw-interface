package collections.my_lists.linkedList;

import collections.my_lists.arrayList.MyArrayList;

import javax.sound.sampled.Line;
import java.util.List;

public class MyLinkedList {
    private Node startNode;
    private int size;

    public MyLinkedList(Object obj) {
        startNode = new Node(obj, null);
    }

    public MyLinkedList() {
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(Object o) {
        Node cur = startNode;
        for (int i = 0; i < size; i++) {
            if (o.equals(cur.getElement())) {
                return true;
            }
            cur = cur.getNext();
        }
        return false;
    }

    public boolean add(Object o) {
        if (startNode == null) {
            startNode = new Node(o, null);
        } else {
//            Node node = startNode; //                1 вариант
//            for (int i = 0; i < size - 1; i++) {
//                node = node.getNext();
//            }

//            Node cur;   //                           2 вариант
//            for (cur = startNode; cur.getNext() != null; cur = cur.getNext()) {
//            }

            Node cur = startNode; //                   3 вариант
            while (cur.getNext() != null) {
                cur = cur.getNext();
            }
            cur.setNext(new Node(o, null));
        }
        size++;
        return true;
    }

    public Object remove(Object o) {
        if (size == 0 || o == null) {
            return false;
        }

        if (startNode.getElement().equals(o)) {
            if (startNode.getNext() != null) {
                startNode = startNode.getNext();
            } else {
                startNode = null;
            }
            size--;
            return true;
        }
        if (size > 1) {
            Node prevNode = startNode;
            Node curNode = startNode.getNext();
            for (int i = 0; i < size; i++) {
                if (curNode.getElement().equals(o)) {
                    prevNode.setNext(curNode.getNext());
                    curNode.setNext(null);
                    size--;
                    return true;
                }
                prevNode = curNode;
                curNode = curNode.getNext();
            }
        }
        return false;
    }

    public void clear() {
        Node prevNode = startNode;
        Node curNode = startNode.getNext();
        for (int i = 0; i < size - 1; i++) {
            prevNode.setNext(null);
            prevNode = curNode;
            curNode = curNode.getNext();
        }
        size = 0;
    }

    public Object get(int i) {
        Node curNode = startNode;
        for (int j = 0; j < i; j++) {
            curNode = curNode.getNext();
        }
        return curNode.getElement();
    }

    private void checkIndex(int index) {
        if ((index >= size) || (index < 0)) {
            System.err.println("Введите корректный индекс, меньше " + size);
            throw new ArrayIndexOutOfBoundsException(index);
        }
    }

    public Object set(int i, Object o) {
        checkIndex(i);
        Node curNode = startNode;
        for (int j = 0; j < i; j++) {
            curNode = curNode.getNext();
        }
        curNode.setElement(o);
        return curNode.getElement();
    }

    public void add(int i, Object o) {
        checkIndex(i);
        Node curNode = startNode;
        for (int j = 0; j < i - 1; j++) {
            curNode = curNode.getNext();
        }
        curNode.setNext(new Node(o, curNode.getNext()));
        size++;
    }

    public Object remove(int i) {
        checkIndex(i);
        Node curNode = startNode;
        for (int j = 0; j < i - 1; j++) {
            curNode = curNode.getNext();
        }
        curNode.setNext((curNode.getNext().getNext()));
        size--;
        return true;
    }

    public int indexOf(Object o) {
        Node curNode = startNode;
        for (int i = 0; i < size; i++) {
            if (o.equals(curNode.getElement())) {
                return i;
            }
            curNode = curNode.getNext();
        }
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }


    public String toString() {
        StringBuilder sb = new StringBuilder("MyLinkedList { ");
        if (startNode != null) {
            Node curNode = startNode;
            for (int i = 0; i < size; i++) {
                sb.append(curNode.getElement()).append(' ');
                curNode = curNode.getNext();
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
