package iostreams.hw;

import java.io.*;

public class Polygon {
    private static final String PATH1 = "src/main/resources/system1.txt";
    private static final String PATH2 = "src/main/resources/system2.txt";
    private static final String PATH3 = "src/main/resources/system3.txt";

    public static void main(String[] args) {

        String sys = "CATALOG: "+System.getProperty("user.home");
        String sys2 = "OS NAME: " + System.getProperty("os.name");
        User person = new User("Dmitriy", 74268);

        serializableUser(person);
        deSerializableUser();

        write(PATH1, sys);
        write(PATH2, sys2);
        read(PATH1);
        read(PATH2);
        // Смена содержимого
        readWrite(PATH1,PATH3);
        readWrite(PATH2,PATH1);
        readWrite(PATH3,PATH2);
        System.out.println("\nПосле смены содержимого: ");
        read(PATH1);
        read(PATH2);



    }

    private static void readWrite(String startPATH,String finishPATH) {
        try (BufferedReader reader = new BufferedReader(new FileReader(startPATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                write(finishPATH,line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void read(String PATH) {
        try (BufferedReader reader = new BufferedReader(new FileReader(PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static void write(String PATH, String sys) {
        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(PATH)))) {
            writer.println(sys);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static void serializableUser(Object user) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream("src/main/resources/person.out"))) {
            objectOutputStream.writeObject(user);
            objectOutputStream.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static void deSerializableUser() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(
                new FileInputStream("src/main/resources/person.out"))) {

            User personFromFile = (User) objectInputStream.readObject();
            System.out.println("Login: " + personFromFile.getLogin() +
                    "\nPassword: " + personFromFile.getPassword() +"\n");

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
