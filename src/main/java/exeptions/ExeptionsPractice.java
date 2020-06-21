package exeptions;

import lombok.SneakyThrows;

import java.io.IOException;

public class ExeptionsPractice {
    public static void main(String[] args) {
//        throw new RuntimeException("Hello");

//        try {
//            throw new Exception("Hola,Exception");
//        } catch (Exception e) {
//            System.out.println("catch " + e.getMessage());
//        }


//        try{
//            execeptionMetod();
//        } catch (Exception e){
//            System.out.println("catch " + e.getMessage());
//        }


//        execeptionMetodSneakyThrows();

//
//        try {
//            throw new IOException();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }


        Child marusia = null;
        try {
            marusia = new Child("Maria", -18);

        } catch (MyException e){
            e.printStackTrace();
            throw new RuntimeException();
        }
        System.out.println(marusia);


//    public static void execeptionMetod() throws Exception{
//        throw new Exception("Hola,Exception");
//    }
//
//    @SneakyThrows
//    public static void execeptionMetodSneakyThrows(){
//        throw new Exception("Hola,Exception");
//    }

    }
//





}
