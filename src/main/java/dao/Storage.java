package dao;

import Models.Menu;
import Models.Order;
import Models.Restaurant;
import Models.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Storage {
    private static Map<String, Restaurant> restaurantList;
    private static Map<String, Order> orderList;
    private static Map<Menu, Restaurant> menuRestaurantMap;
    private static Map<User, List<Order>> userOrder;

    public static Map<String, Restaurant> getRestaurantList() {
        if(Objects.isNull(restaurantList)) {
            restaurantList = new HashMap<>();
        }
        return restaurantList;
    }

    public static Map<String, Order> getOrderList() {
        if(Objects.isNull(restaurantList)) {
            orderList = new HashMap<>();
        }
        return orderList;
    }

    public static Map<Menu, Restaurant> getMenuRestaurantMap() {
        if(Objects.isNull(restaurantList)) {
            menuRestaurantMap = new HashMap<>();
        }
        return menuRestaurantMap;
    }

    public static Map<User, List<Order>> getUserOrder() {
        if(Objects.isNull(restaurantList)) {
            userOrder = new HashMap<>();
        }
        return userOrder;
    }
}
