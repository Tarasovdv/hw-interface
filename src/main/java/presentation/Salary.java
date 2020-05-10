package presentation;

public class Salary {
    private double baseSalary;
    private static double increaseCoefficient = 2.5;


    public Salary(double baseSalary) {
        this.baseSalary = baseSalary;

    }

    public double getFullSalary() {
        return baseSalary * increaseCoefficient;
    }
}
