package exeptions.hw;

public class LexusExc {
    private String model;
    private int yearProduction;

    public LexusExc(String model, int yearProduction) throws HwException {
        this.model = model;
        if ((yearProduction < 1989) || (yearProduction > 2020)) {
            throw new HwException("Введена некорректная дата выпуска авто! ");
        }
        this.yearProduction = yearProduction;
    }
}
