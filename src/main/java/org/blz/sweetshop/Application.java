package org.blz.sweetshop;

import java.util.Set;


public class Application {
    public static void main(String[] args) {
        System.out.println("Welcome To Sweet Shop Management System");
        int option = 0;
        Application application = new Application();
        while (option != 7) {
            option = application.userInterface.showUserMenu();
            application.handleUserSelection(option);
            System.out.println("bye bye");
        }
    }

    SweetRepository sweetRepository = SweetRepository.getInstance();
    UserInterface userInterface =  UserInterface.getInstance();

    public void handleUserSelection(int option) {
        Set sweetSet = sweetRepository.getSweetList();
        switch (option) {
            case 1:
                addSweet();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                userInterface.print(sweetSet);
                break;
            case 5:
                System.out.println("\n printing Idiet sweet \n");
                userInterface.printDietSweet(sweetSet);
                break;
            case 6:
                System.out.println("\n printing Inormal sweet \n");
                userInterface.printNormalSweet(sweetSet);
                break;
            case 7:
                break;
            default:
                System.out.println("enter right option");
                break;
        }
    }

    public void addSweet() {
        Jilebi jilebi = new Jilebi();
        jilebi.id = "j001";
        jilebi.price = 10;
        Kalakand kalakand = new Kalakand();
        kalakand.id = "k001";
        kalakand.price = 20;
        Laddu laddu = new Laddu();
        laddu.id = "L003";
        laddu.price = 30;
        Poothareku poothareku = new Poothareku();
        poothareku.id = "p005";
        poothareku.price = 40;
        Mitai mitai = new Mitai();
        mitai.id = "M008";
        mitai.price = 50;
        Mitai mitai1 = new Mitai();
        mitai1.price = 55;
        mitai1.id = "M008";


        sweetRepository.add(jilebi);
        sweetRepository.add(kalakand);
        sweetRepository.add(laddu);
        sweetRepository.add(mitai);
        sweetRepository.add(poothareku);
        sweetRepository.add(poothareku);
        sweetRepository.add(mitai1);
    }
}
