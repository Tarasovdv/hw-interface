package exeptions;

public class Child {
    private final String name;
    private int age;

    public Child(String name, int age) throws MyException {
        this.name = name;
        if ((age < 8) || (age > 18)) {
            throw new MyException("Некорректный возраст");
        }
        this.age = age;
    }
}
