package classWork;

import lombok.Getter;

@Getter
public class Friends extends Person {
    private String name;

    public Friends(String name, String surname, int age) {
        super(name, surname, age);
    }

    @Override
    public String toString() {
        return name + " :Погнали мужики!";
    }


}
