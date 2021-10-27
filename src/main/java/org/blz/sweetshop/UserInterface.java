package org.blz.sweetshop;
import java.util.Scanner;
import java.util.List;
import java.util.Set;

public class UserInterface {

    private static UserInterface instance;

    private UserInterface() {

    }
    public static UserInterface getInstance() {
        if (instance == null) {
            instance = new UserInterface();
        }
        return instance;
    }


    public int showUserMenu() {
        System.out.println("\n 1.to add the sweet");
        System.out.println("\n 2.to remove the sweet");
        System.out.println("\n 3.to edit the sweet");
        System.out.println("\n 4.print all sweets");
        System.out.println("\n 5.print diet sweets");
        System.out.println("\n 6.print normal sweets");
        System.out.println("\n 7.to exit from the menu");

        Scanner sc = new Scanner(System.in);
        int option =sc.nextInt();
        return option;
    }

    public void print(Set<Sweet> set) {

        for (Sweet sweet : set) {
            System.out.println(sweet);
        }
    }

    public void printDietSweet(Set<Sweet> set) {
        for (Sweet sweet : set) {
            if (sweet instanceof IDiet) {
                System.out.println(sweet);
            }
        }
    }

    public void printNormalSweet(Set<Sweet> set) {
        for (Sweet sweet : set) {
            if (sweet instanceof INormal) {
                System.out.println(sweet);
            }
        }
    }
}

