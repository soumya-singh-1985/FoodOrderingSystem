package Models;

import lombok.Getter;

@Getter
public class Menu {
    private String name;
    private double price;

    public Menu(String menuName, double price) {
        this.name = menuName;
        this.price = price;
    }
}
