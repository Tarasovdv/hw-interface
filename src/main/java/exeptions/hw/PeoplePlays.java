package exeptions.hw;

public class PeoplePlays extends RuntimeException {
    public static void main(String[] args) {

        PersonExc dima = null;

        try {
            dima = new PersonExc("Dima", 1800);
        } catch (HwRuntimeException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Done! ");
        }
    }
}
