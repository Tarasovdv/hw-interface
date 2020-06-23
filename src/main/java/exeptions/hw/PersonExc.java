package exeptions.hw;

public class PersonExc {
    private String name;
    private int yearBirth;

    public PersonExc(String name, int age) {
        this.name = name;
        if ((yearBirth < 1900) || (yearBirth > 2020)) {
            throw new HwRuntimeException("Введен некорректный год рождения! ");
        }
        this.yearBirth = age;
    }
}
