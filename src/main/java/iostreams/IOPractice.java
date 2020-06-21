package iostreams;

import collections.Men;
import hero.Man;

import java.io.*;

public class IOPractice {
    public static void main(String[] args) {

//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//
//        try {
//            String input = reader.readLine();
//            System.out.println("Input: " + input);
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                reader.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//        }


//        try (BufferedReader reader = new BufferedReader(
//                new InputStreamReader(System.in))) {
//
//            String input = reader.readLine();
//            System.out.println("Input: " + input);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        File file = new File("src/main/resources/file.txt");
//
//        try (PrintWriter printWriter = new PrintWriter(file)) {
//            printWriter.println("Privet 1 string in file");
//            printWriter.println("Privet 2 string in file");
//            printWriter.println("Privet 3 string in file");
//            printWriter.println("Privet 4 string in file");
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        try(BufferedReader fileReader = new BufferedReader(new FileReader(file))) {
////            System.out.println(fileReader.readLine());
//
//            while (fileReader.ready()){
//            System.out.println(fileReader.readLine());
//
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        try {
//            String input;
//            while (!(input = reader.readLine()).equals("End")) {
//                System.out.println(input);
//
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        Men men = new Men("Vit", 18, "male");
//
//        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(
//        new FileOutputStream("src/main/resources/man.out"))) {
//            objectOutputStream.writeObject(men);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        try (ObjectInputStream objectInputStream = new ObjectInputStream(
//                new FileInputStream("src/main/resources/man.out"))) {
//
//            Men menFromFile = (Men) objectInputStream.readObject();
//            System.out.println(menFromFile.getName());
//
//        } catch (IOException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }
    }
}
