package collections.set.hw;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Objects;

@AllArgsConstructor
@Getter
public class Fruit {
    private final String title;
    private double weight;

    @Override
    public String toString() {
        return "Fruit: " + title + " | Weight: " + weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruit fruit = (Fruit) o;
        return Double.compare(fruit.weight, weight) == 0 &&
                Objects.equals(title, fruit.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, weight);
    }
}
