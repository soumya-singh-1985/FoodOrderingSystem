package Models;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Set;
import java.util.UUID;

@Getter
@RequiredArgsConstructor
public class Restaurant {
    private String restaurantId = UUID.randomUUID().toString();
    private String name;
    private String location;
    private Set<Menu> menuItems;
    private double processingPower;

    @Setter
    private double currentProcessingPower = this.processingPower;

    public Restaurant(String name, String location, Set<Menu> menu, double processingPower) {
        this.name = name;
        this.location = location;
        this.menuItems = menu;
        this.processingPower = processingPower;
    }
}
