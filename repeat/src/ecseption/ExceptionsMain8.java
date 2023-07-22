package ecseption;

import java.util.Random;
import java.util.Scanner;

public class ExceptionsMain8 {

    public static void main(String[] args) {
        try {
            method1();
        }catch (IllegalStateException e){
            System.out.println("Произошла ошибка");
        }finally {
            System.out.println("а я тоже закончил_!");
        }
    }

    public static void method1(){
        try {
            method2();
        }catch (IllegalStateException e){
        }
    }

    public static void method2(){
        try {
            method3();
        }finally {
            System.out.println("Я закончил работу_!");
        }
    }

   public static void method3(){
       Random rnd = new Random();
       int size = rnd.nextInt(10);
        if (size == 0){
           throw new IllegalStateException("size не может быть 0");
       }
   }
}
