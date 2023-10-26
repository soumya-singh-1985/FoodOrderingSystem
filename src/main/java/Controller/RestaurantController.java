package Controller;

import Models.Menu;
import Models.Restaurant;
import Service.MenuService;
import Service.OnboardingService;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Set;

public class RestaurantController {

    private OnboardingService onboardingService;
    private MenuService menuService;

    public RestaurantController(OnboardingService onboardingService, MenuService menuService) {
        this.onboardingService = onboardingService;
        this.menuService = menuService;
    }

    public Restaurant addRestaurant(@NotNull final String name, @NotNull final String location,
                                    @NotNull final Set<Menu> menuItems, final double processingPower) {
        return onboardingService.onboardrestaurant(name, location, menuItems, processingPower);
    }

    public void addMenu(@NotNull final String restaurantId, @NotNull final String menuName,
                        final double price) {
        menuService.addMenu(restaurantId, menuName, price);
    }

    public void showRestaurants() {
        onboardingService.showRestaurants();
    }
}
