package collections;

import lombok.Getter;

@Getter

public class Men extends Person{

    public Men(String name, int age, String sex) {
        super(name, age, sex);
    }

    @Override
    public String toString() {
        return super.toString();
    }


}
