package collections.my_lists;


public class MyArrayList {
    private Object[] array;
    private int size;
    public static final int DEFAULT_CAPACITY = 10;

    public MyArrayList() {
        array = new Object[DEFAULT_CAPACITY];
        size = 0;
    }


    public MyArrayList subList(int start, int finish) {
        checkIndex(start);
        checkIndex(finish);
        MyArrayList arrayList = new MyArrayList();
        for (int j = start; j < finish; j++) {
            arrayList.add(array[j]);
        }
        return arrayList;
    }


    public int size() {

        return size;
    }

    public boolean isEmpty() {

        return size == 0;
    }


    public boolean contains(Object o) {
        for (Object value : array) {
            if (value.equals(o)) {
                return true;
            }
        }
        return false;
    }

    public boolean add(Object o) {
        if (size >= array.length) {
            Object[] resArray = new Object[3 * 2 * size + 1];
            System.arraycopy(array, 0, resArray, 0, size);
            array = resArray;
        }
        array[size++] = o;
        //size++;
        return true;
    }

    public void remove(Object o) {
        Object[] resArray = new Object[array.length - 1];
        int index;
        for (index = 0; index < array.length; index++) {//нахождение индекса элемента
            if (array[index].equals(o)) {
                break;
            } else if ((index == array.length - 1)) { //не позволяет выйти за границы массива, если эл-т не найден в массиве
                System.out.println("Элемент не найден");
            } else {
                resArray[index] = array[index]; //присваиваем элемент в новый массив согласно цикла, если искомый объект еще не найден
            }
        }

        //присваиваем оставшиеся элементы исключая выбранный.
        if (resArray.length - index >= 0) {
            System.arraycopy(array, index + 1, resArray, index, resArray.length - index);
            array = resArray;
        }


    }


    public void clear() {
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
            size = 0;
        }
    }

    public Object get(int i) {
        checkIndex(i);
        return array[i];
    }

    private void checkIndex(int index) {
        if ((index >= size) || (index < 0)) {
            System.err.println("Введите корректный индекс, меньше " + size);
            throw new ArrayIndexOutOfBoundsException(index);
        }

    }


    public void set (int i, Object o) {
        checkIndex(i);
        array[i] = o;
    }

    public void add(int index, Object o) {
        checkIndex(index);
        if (size >= array.length) {
            Object[] resArray = new Object[3 * 2 * size + 1];
            System.arraycopy(array, index, resArray, index + 1, size-index );
            array = resArray;
        }
        array[index] = o;
        //size++;

    }

    public Object remove(int index) {

        System.arraycopy(array, index + 1, array, index, size -1 - index);

        return array;
    }

    public int indexOf(Object o) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(o)) {
                return i;

            }

        }
        return 0;
    }

    public int lastIndexOf(Object o) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i].equals(o)) {
                return i;

            }

        }
        return 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("MyArrayList { ");
        for (int i = 0; i < size; i++) {
            sb.append(array[i].toString()).append(' ');
        }
        sb.append('}');

        return sb.toString();

    }


}
