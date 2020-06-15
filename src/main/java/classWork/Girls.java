package classWork;

import lombok.Getter;

@Getter
public class Girls extends Person {
    private String name;

    public Girls(String name, String surname, int age) {
        super(name, surname, age);
    }

    @Override
    public String toString() {
        return name + " :Подожди мне надо накраситься";
    }
}
