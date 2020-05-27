package presentation;

public class Tiger {
    private String name;
    private double weight;
    private double height;
    private int age;

    public Tiger(String name) {
        this.name = name;
    }

    public Tiger(String name, double weight, double height, int age) {
        this(name);
        this.weight = weight;
        this.height = height;
        this.age = age;
    }

    public void sayTiger(String name, int age) {
        System.out.println(name + " says how old is he: ");
        for (int i = 0; i < age; i++) {
            System.out.print(" ARR " + " ");
        }
        System.out.println();
    }

    public void sayTiger(String name) {
        System.out.println(name + " say: Meow ");
        System.out.println();
    }

    @Override
    public String toString() {
        return " name: " + name + "\n" +
                " weight: " + weight + "\n" +
                " height: " + height + "\n" +
                " age: " + age + "\n";
    }
}
