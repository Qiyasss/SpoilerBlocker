package bean;

import java.util.Scanner;

public class Customer {

     String name;
     String surname;
     String nickname;


     public static void customer () {
         Scanner scan = new Scanner(System.in);

         System.out.println("Enter your Name:");
         String enterName = scan.nextLine();
         System.out.println("Enter your Surname:");
         String surName = scan.nextLine();


     } public static String nickname () {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Nickname:");
        String nickName = scan.nextLine();


        return nickName;   }

}
