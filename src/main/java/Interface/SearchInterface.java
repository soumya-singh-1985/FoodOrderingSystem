package Interface;

import Models.Menu;
import Models.Restaurant;

import java.util.List;

public interface SearchInterface {

    public List<Restaurant> search(String location);
    public List<Restaurant> search(List<Menu> menuList);
}
