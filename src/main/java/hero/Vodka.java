package hero;


public class Vodka {
    private String marka;
    private double volume;
    private double degree;
    private String taste;

    public Vodka(String marka, double volume, double degree, String taste) {
        this.marka = marka;
        this.volume = volume;
        this.degree = degree;
        this.taste = taste;
    }

    public Vodka(String marka, double volume, double degree) {
        this.marka = marka;
        this.volume = volume;
        this.degree = degree;

    }

    public void drinkTooMuch(String name, int date) {
        System.out.println(name + ", Хватит пить!!! " + date + " числа на работу!");
    }

    public void drinkTooMuch(String name) {
        System.out.println(name + ", Хватит пить!!! Завтра на работу!");
    }

    @Override
    public String toString() {
        return " marka: " + marka + "\n" +
                " volume: " + volume + "\n" +
                " degree: " + degree + "\n" +
                " taste: " + taste;
    }
}
