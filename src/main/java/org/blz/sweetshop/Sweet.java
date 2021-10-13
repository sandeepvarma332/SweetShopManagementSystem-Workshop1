package org.blz.sweetshop;


import java.util.Objects;

public class Sweet {

    enum Colour {
        RED, WHITE, YELLOW, LIGHT_YELLOW, LIGHT_WHITE;
    }

    enum Category {
        MILK, SUGAR, JAGGUARY, GHEE;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sweet sweet = (Sweet) o;
        return Objects.equals(id, sweet.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
