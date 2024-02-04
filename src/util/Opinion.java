package util;

import bean.Customer;

import java.util.Scanner;

public class Opinion {

    public static String opinion() {

        System.out.println("Enter your opinion");
        Scanner scan = new Scanner(System.in);
        String chooseO = scan.nextLine();
        System.out.println(Customer.nickname() + " : ");

        return chooseO;

    }

    public static String opinion2() {

        System.out.println("Enter your opinion");
        Scanner scan = new Scanner(System.in);
        String chooseO0 = scan.nextLine();
        System.out.println(Customer.nickname() + " : " + chooseO0);

        return chooseO0;

    }
}
