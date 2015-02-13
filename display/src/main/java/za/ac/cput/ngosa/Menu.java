package za.ac.cput.ngosa;import java.lang.System;import java.util.*;import java.util.Scanner;

/**
 * Created by User on 2015/02/13.
 */
public class Menu {

    int choice;
    Scanner input= new Scanner(System.in);
    public int choose() {

        System.out.println("1. Convert litres to meter^3");
        System.out.println("2. Convert meter^3 to litres ");
        System.out.println("0. Exit \n");

        choice = input.nextInt();

        while (choice < 0 || choice > 2) {
            System.out.println("Invalid choice, please re enter \n");

            System.out.println("1. Convert litres to meter^3");
            System.out.println("2. Convert meter^3 to litres ");
            System.out.println("0. Exit");

            choice = input.nextInt();
        }
        return choice;
    }

    }

