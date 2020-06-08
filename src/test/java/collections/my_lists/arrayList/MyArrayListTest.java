package collections.my_lists.arrayList;

import collections.my_lists.arrayList.MyArrayList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Класс MyArrayList имеет:")
public class MyArrayListTest {
    private final MyArrayList list = new MyArrayList();
    private final MyArrayList list2 = new MyArrayList();

    @Test
    @DisplayName("Корректный метод add: ")
    public void shouldHaveCorrectMethodAdd() {
        String element = "element";
        list.add(element);
        assertEquals("element", String.valueOf(list.get(0)));
    }

    @Test
    @DisplayName("Корректный метод size: ")
    public void shouldHaveCorrectMethodSize() {
        String element = "element";
        list.add(element);
        assertEquals(1, list.size());
    }

    @Test
    @DisplayName("Корректный метод IndexOf: ")
    public void shouldHaveCorrectIndexOf() {
        list.add("element1");
        list.add("element2");
        assertEquals(0, list.indexOf("element1"));
    }

    @Test
    @DisplayName("Корректный метод LastIndexOf: ")
    public void shouldHaveCorrectLastIndexOf() {
        list.add("element1");
        list.add("element2");
        list.add("element3");
        list.add("element1");
        list.add("element5");
        assertEquals(3, list.lastIndexOf("element1"));
    }

    @Test
    @DisplayName("Корректный метод remove: ")
    public void shouldHaveCorrectMethodRemove() {
        list.add("a");
        list.add("b");
        list.add("c");
        list.remove(2);

        list2.add("a");
        list2.add("b");

        assertEquals(list2.size(), list.size());
    }

    @Test
    @DisplayName("Корректный метод subList: ")
    public void shouldHaveCorrectMethodSubList() {
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.subList(0,2);

        list2.add("a");
        list2.add("b");

        assertEquals(list2.size(), list.subList(0,2).size());
    }

    @Test
    @DisplayName("Корректный метод isEmpty: ")
    public void shouldHaveCorrectMethodIsEmpty() {
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        assertEquals(false, list.isEmpty());
    }

    @Test
    @DisplayName("Корректный метод contains: ")
    public void shouldHaveCorrectMethodContains() {
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        assertEquals(true, list.contains("c"));
    }

    @Test
    @DisplayName("Корректный метод clear: ")
    public void shouldHaveCorrectMethodClear() {
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.clear();

        assertEquals(true, list.isEmpty());
    }

    @Test
    @DisplayName("Корректный метод get: ")
    public void shouldHaveCorrectMethodGet() {
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        assertEquals("c", list.get(2));
    }

    @Test
    @DisplayName("Корректный метод set: ")
    public void shouldHaveCorrectMethodSet() {
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.set(2, "A");

        list2.add("a");
        list2.add("b");
        list2.add("A");
        list2.add("d");

        assertEquals(list2.size(), list.size());
    }

}
