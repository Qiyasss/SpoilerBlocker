package main;

import bean.Customer;
import util.Opinion;
import util.SpoilerBlockerrUtil;

import java.util.Scanner;

public class AboutFilm {

    public String text() {

        boolean boo = true;
        System.out.println("Hi! Do you want to share your opinion with us about film? \nYes/No ");
        while (boo) {


            Scanner scan = new Scanner(System.in);
            String chooseOpi = scan.nextLine();
            if (chooseOpi.equalsIgnoreCase("No")) {
                System.out.println("Thanks for watching!");
                System.exit(0);
            } else if (chooseOpi.equalsIgnoreCase("Yes")) {
                System.out.println("Does your opinion contain any spoilers? \nYes/No");
                String chooseCon = scan.nextLine();
                if (chooseCon.equalsIgnoreCase("No")) {
                    Customer.customer();
                    Opinion.opinion2();
                    System.out.println("Thanks! Your feedback is important for us");

                } else if (chooseCon.equalsIgnoreCase("Yes")) {
                    Customer.customer();
                    SpoilerBlockerrUtil.blocker();
                    System.out.println("Thanks! Your feedback is important for us");
                }

            }
                System.out.println("Do you want to share your opinion with us about film any more? \nYes/No");
                    String choosee = scan.nextLine();
                if (choosee.equalsIgnoreCase("No")) {
                   System.exit(0);
                    System.out.println("Thanks for watching!");
                } else if (choosee.equalsIgnoreCase("Yes")) {
                   text();
                }
            }return "Thanks! Your feedback is important for us";

        }



}
