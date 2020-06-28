package threads.hw;

public class ThreadHW {
    public static void main(String[] args) {

        PrintName printName = new PrintName();
        printName.start();

        PrintMessage message = new PrintMessage();
        Thread tMessage = new Thread(message);
        tMessage.start();

    }
}
