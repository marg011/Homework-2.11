package pro.sky.skyprospringshoppingcart.services;

import java.util.List;

public interface ShoppingcartService {
    void addItems(Integer ids[]);

    List<Integer> getItems();
}
