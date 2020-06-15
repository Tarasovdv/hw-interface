package collections.set;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Glass {
    private final String material;
    private final double mls;

    @Override
    public String toString() {
        return "Glass{" +
                "material='" + material + '\'' +
                ", mls=" + mls +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Glass glass = (Glass) o;

        if (Double.compare(glass.mls, mls) != 0) return false;
        return material != null ? material.equals(glass.material) : glass.material == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = material != null ? material.hashCode() : 0;
        temp = Double.doubleToLongBits(mls);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
