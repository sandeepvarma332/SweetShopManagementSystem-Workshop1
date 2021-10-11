package org.blz.sweetshop;


public class Sweet {

    enum Colour {
        RED,WHITE,YELLOW,LIGHT_YELLOW,LIGHT_WHITE;
    }

    enum Category {
        MILK,SUGAR,JAGGUARY,GHEE;
    }

    Colour colour;
    Category category;
    String id;
    int price;
    String name;

    @Override
    public String toString() {
        return "Sweet{" +
                "Colour='" + colour + '\'' +
                ", Category='" + category + '\'' +
                ", id='" + id + '\'' +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
