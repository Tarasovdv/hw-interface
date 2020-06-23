package threads;

public class ThreadPractice {
    public static void main(String[] args) throws InterruptedException {
//        for (int i = 0; i < 10; i++) {
////            for (int j = 0; j <10_000_000 ; j++) {
////
////            }
//            Thread.sleep(1000);
//            System.out.print("F ");
//        }

//        for (int i = 0; i < 10 ; i++) {
//            Thread.sleep(2500);
//            System.out.print(" S ");
//        }

//        System.out.println(Thread.currentThread().getName() + " Start");
//
//        PrinterS printerSecond = new PrinterS();
//        printerSecond.start();
//
//
//        PrinterF printerF = new PrinterF();
//        Thread tPrinterF = new Thread(printerF);
////        System.out.println("tPrinterF.getName() = " + tPrinterF.getName());
//        tPrinterF.start();
//
//        tPrinterF.join();
//        printerSecond.join();
//        System.out.println(Thread.currentThread().getName() + " End");


//        for (int i = 0; i < 10; i++) {
//            Thread.sleep(1000);
//            System.out.print("F ");
//        }

//        Thread.currentThread().join(); // DeadLock


        Thread thread = new Thread(){
            @Override
            public void run() {
                System.out.println(2);
            }
        };

//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(3);
//            }
//        };

        Runnable runnable = () -> System.out.println(3);

        Thread thread2 = new Thread(runnable);

        thread2.start();
        thread.start();

        new Thread(() -> System.out.println(4)).start();

    }
}


// создать потоки разными способами.  унаслед от Runnable и Thread
// прогр кот.вывод сообщ.раз в 5 сек
// Изучить Потоки join(), sleep()
// * Про лямбды выраж в Java, анонимные классы.