package org.blz.sweetshop;


public class Application {
    public static void main( String[] args ) {
        System.out.println( "Welcome To Sweet Shop Management System" );
        Jilebi jilebi = new Jilebi();
        jilebi.id = "j001";
        jilebi.price = 10;
        Kalakand kalakand = new Kalakand();
        kalakand.id ="k001";
        kalakand.price = 20;
        Laddu laddu = new Laddu();
        laddu.id = "L003";
        laddu.price = 30;
        Poothareku poothareku = new Poothareku();
        poothareku. id = "p005";
        poothareku.price = 40;
        Mitai mitai = new Mitai();
        mitai.id = "M008";
        mitai.price = 50;

        SweetRepository  sweetRepository = new SweetRepository();
        sweetRepository.add(jilebi);
        sweetRepository.add(kalakand);
        sweetRepository.add(laddu);
        sweetRepository.add(mitai);
        sweetRepository.add(poothareku);

        UserInterface userInterface = new UserInterface();
        userInterface.print(sweetRepository.getSweetList());


    }
}
