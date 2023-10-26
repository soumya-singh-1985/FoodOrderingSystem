import Controller.RestaurantController;
import Models.Menu;
import Models.Restaurant;
import Service.MenuService;
import Service.OnboardingService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class CleartripDemoTest {

    static RestaurantController restaurantController;
    @BeforeAll
    public static void setup() {
        OnboardingService onboardingService = new OnboardingService();
        MenuService menuService = new MenuService();
        restaurantController = new RestaurantController(onboardingService, menuService);
    }

    @Test
    public void test() {
        System.out.println("In Test, adding Restaurant with data -> geeta, pune, (item1, item2), 3");
        Set<Menu> menuSet = new HashSet<>();
        Menu menu1 = new Menu("Item1", 3);
        Menu menu2 = new Menu("Item2", 5);
        menuSet.add(menu1);
        menuSet.add(menu2);
        Restaurant restaurant = restaurantController.addRestaurant("geeta", "pune", menuSet, 3);
        System.out.println("Restaurant add: " + restaurant.getName());


    }
}
