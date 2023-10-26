package Service;

import Models.Menu;
import Models.Restaurant;
import dao.Storage;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Slf4j
public class OnboardingService {

    Map<String, Restaurant> restaurantList= Storage.getRestaurantList();
    public Restaurant onboardrestaurant(String name, String location, Set<Menu> menu, double processingPower) {
        Restaurant restaurant = new Restaurant(name, location, menu, processingPower);
        restaurantList.put(restaurant.getRestaurantId(), restaurant);
        return restaurant;
    }

    public void showRestaurants() {
        restaurantList.values().stream().peek(restaurant ->
                log.info("Restaurant {} : {}", restaurant.getName(), restaurant.getCurrentProcessingPower()));
    }
}
