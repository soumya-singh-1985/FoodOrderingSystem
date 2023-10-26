package Service;

import Models.Menu;
import Models.Restaurant;
import dao.Storage;

public class MenuService {

    public void addMenu(String restaurnatId, String menuName, double price) {
      Menu menu = new Menu(menuName, price);
        Storage.getRestaurantList().get(restaurnatId).getMenuItems().add(menu);
    }
}
