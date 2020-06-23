package exeptions.hw;

public class Shop {
    public static void main(String[] args) throws Exception {


        //LexusExc gs = null;

        try {
           LexusExc gs = new LexusExc("GS300",2021);
        } catch (HwException e) {
            e.printStackTrace();
            exceptionMethod();
        } finally {
            System.out.println("Проверка завершена! ");
        }


        try{
            exceptionMethod();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }


    public static void exceptionMethod() throws Exception{
        throw new HwException("Введите корректный год выпуска! ");
    }
}
