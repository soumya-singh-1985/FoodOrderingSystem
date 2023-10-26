package Models;

import lombok.Setter;

import java.util.Set;
import java.util.UUID;

public class Order {
    private String orderId = UUID.randomUUID().toString();
    private String restaurantId;
    private String userId;
    private Set<Menu> menuList;
    @Setter
    private double processingPowerRequired = menuList.size()*0.5;
}
