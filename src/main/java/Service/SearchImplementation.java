package Service;

import Interface.SearchInterface;
import Models.Menu;
import Models.Restaurant;
import dao.Storage;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class SearchImplementation implements SearchInterface {

    private Map<String, Restaurant> restaurantListMap = Storage.getRestaurantList();
    private Map<Menu, Restaurant> menuRestaurantMap = Storage.getMenuRestaurantMap();
    @Override
    public List<Restaurant> search(String location) {
        return restaurantListMap.values().stream().filter(restaurant -> restaurant.getLocation().equals(location))
                .collect(Collectors.toList());
    }

    @Override
    public List<Restaurant> search(List<Menu> menuList) {
//        Set<Restaurant> restaurantSet;
//
//        for (Menu menu :
//                menuList) {
//            restaurantSet.add(menuRestaurantMap.get(menu));
//        }
        return null;
    }
}
